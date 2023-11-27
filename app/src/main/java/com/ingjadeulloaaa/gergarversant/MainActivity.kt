package com.ingjadeulloaaa.gergarversant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // btn welcome to navigate to menuActivity
        val btnWelcome = findViewById<AppCompatButton>(R.id.btnWelcome)
        btnWelcome.setOnClickListener {
            navigateToMenuActivity()
        }
    }

    // navigation
    private fun navigateToMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}