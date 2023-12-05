package com.example.arcega.ranierdave.block1.p1.quiz

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.arcega.ranierdave.block1.p1.quiz.ui.theme.RanierArcegaBlock1QuizTheme

class MainActivity : AppCompatActivity() {

    private lateinit var loginEmail : EditText
    private lateinit var loginPassword : EditText
    private lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginEmail = findViewById(R.id.inputEmail)
        loginPassword = findViewById(R.id.inputPassword)
        loginBtn = findViewById(R.id.loginButton)

        loginBtn.setOnClickListener {

            val insertedEmail = loginEmail.text.toString()
            val insertedPass = loginPassword.text.toString()

            if (TextUtils.isEmpty(insertedEmail) || TextUtils.isEmpty(insertedPass)) {
                Toast.makeText(this, "Add Email & Password!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Credentials!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
