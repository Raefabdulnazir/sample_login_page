package com.example.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val submitButton = findViewById<Button>(R.id.button2)

        submitButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()

            if(isValidEmail(email)){
                initiatePasswordRecovery(email)
            }
            else {
                showErrorMessage("Invalid Error Format")
            }
        }
    }

    private fun isValidEmail(email: String): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun initiatePasswordRecovery(email: String){
        val isEmailSentSuccessfully = true
        if(isEmailSentSuccessfully){
            showConfirmationMessage("Password reset email sent successfully")
        }
        else {
            showErrorMessage("Failed to send reset email . Please try again")
        }
    }

    private fun showConfirmationMessage(message: String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    private fun showErrorMessage(message: String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}