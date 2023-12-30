package com.ingjadeulloaaa.gergarversant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // icn grammar
        val icnGrammar = findViewById<ImageView>(R.id.icnGrammar)
        icnGrammar.setOnClickListener {
            navigateToGrammar()
        }

        // auditive comprehension img
        val auditiveComprehension = findViewById<ImageView>(R.id.auditiveComprehension)
        auditiveComprehension.setOnClickListener {
            navigateToAuditiveComprehension()
        }

    }

    private fun navigateToAuditiveComprehension() {
        val intent = Intent(this, AuditiveComprehensionActivity::class.java)
        startActivity(intent)
    }


    private fun navigateToGrammar() {
        val intent = Intent(this, GrammarActivity::class.java)
        startActivity(intent)
    }


}