package com.example.sampleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.TextView
import android.widget.ToggleButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val passwordToggle = findViewById<ToggleButton>(R.id.passwordToggle)

        passwordToggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){//show the password
                passwordEditText.transformationMethod = HideReturnsTransformationMethod.getInstance()
            }
            else{//hide the password
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }

        val forgotPassordTextView = findViewById<TextView>(R.id.forgotPasswordTextView)

        forgotPassordTextView.setOnClickListener {
            val intent = Intent(this,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}   