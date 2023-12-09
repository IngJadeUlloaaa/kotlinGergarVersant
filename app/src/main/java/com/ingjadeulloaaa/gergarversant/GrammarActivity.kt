package com.ingjadeulloaaa.gergarversant

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GrammarActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var score: TextView
    private lateinit var questionTextView: TextView
    private lateinit var ansA: Button
    private lateinit var ansB: Button
    private lateinit var ansC: Button
    private lateinit var ansD: Button

    private var scoreValue = 1
    private var currentQuestionIndex = 0
    private var selectedAnswer = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar)

        score = findViewById(R.id.score)
        questionTextView = findViewById(R.id.questionQuiz)
        ansA = findViewById(R.id.ansA)
        ansB = findViewById(R.id.ansB)
        ansC = findViewById(R.id.ansC)
        ansD = findViewById(R.id.ansD)

        ansA.setOnClickListener(this)
        ansB.setOnClickListener(this)
        ansC.setOnClickListener(this)
        ansD.setOnClickListener(this)

        updateScore() // Inicializamos el puntaje en la vista
        loadNewQuestion()
    }

    override fun onClick(view: View) {
        val clickedButton = view as Button

        // Código relacionado con los botones de respuesta
        resetButtonStyles()  // Restablecer estilos antes de seleccionar uno nuevo

        selectedAnswer = clickedButton.text.toString()

        // Check the answer and move to the next question
        if (selectedAnswer == AnswerQuestion.QuestionAnswer.correctAnswers[currentQuestionIndex]) {
            // Respuesta correcta
            clickedButton.setBackgroundColor(Color.parseColor("#4CAF50"))  // Verde
            clickedButton.background.alpha = 128  // 50% de transparencia
            scoreValue++
            updateScore()
        } else {
            // Respuesta incorrecta
            clickedButton.setBackgroundColor(Color.parseColor("#FF5733"))  // Rojo
            clickedButton.background.alpha = 128  // 50% de transparencia
        }

        currentQuestionIndex++
        loadNewQuestion()
    }

    private fun resetButtonStyles() {
        ansA.setBackgroundColor(Color.parseColor("#4DFFFFFF"))
        ansB.setBackgroundColor(Color.parseColor("#4DFFFFFF"))
        ansC.setBackgroundColor(Color.parseColor("#4DFFFFFF"))
        ansD.setBackgroundColor(Color.parseColor("#4DFFFFFF"))
    }

    private fun loadNewQuestion() {
        if (currentQuestionIndex < AnswerQuestion.QuestionAnswer.questions.size) {
            // Update question and choices
            questionTextView.text = AnswerQuestion.QuestionAnswer.questions[currentQuestionIndex]
            ansA.text = AnswerQuestion.QuestionAnswer.choices[currentQuestionIndex][0]
            ansB.text = AnswerQuestion.QuestionAnswer.choices[currentQuestionIndex][1]
            ansC.text = AnswerQuestion.QuestionAnswer.choices[currentQuestionIndex][2]
            ansD.text = AnswerQuestion.QuestionAnswer.choices[currentQuestionIndex][3]
        } else {
            finishQuiz()
        }
    }

    private fun finishQuiz() {
        val passStatus =
            if (scoreValue > AnswerQuestion.QuestionAnswer.questions.size * 0.60) "Passed" else "Failed"

        // Show a dialog with the quiz result
        // You can customize this part based on your requirements
        // ...
        AlertDialog.Builder(this).setTitle(passStatus)
            .setMessage("Score is $scoreValue out of ${AnswerQuestion.QuestionAnswer.questions.size}")
            .setPositiveButton("Restart") { _, _ -> restartQuiz() }.setCancelable(false).show()
    }

    private fun restartQuiz() {
        scoreValue = 1
        currentQuestionIndex = 0
        updateScore()
        loadNewQuestion()
    }

    private fun updateScore() {
        score.text = getString(R.string.scoreContainer, scoreValue)
    }
}