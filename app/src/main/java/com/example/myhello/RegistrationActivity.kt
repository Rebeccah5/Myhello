package com.example.myhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration)
        btnSignUp.setOnClickListener{
            var FirstName=etFirstName.text.toString()
            var LastName=etLastName.text.toString()
            var Email=etEmail.text.toString()
            var PhoneNumber=etPhoneNumber.text.toString()
            var Password=etPassword.text.toString()
            var ConfirmPassword=etConfirmPassword.text.toString()
            Toast.makeText(baseContext,Email,Toast.LENGTH_LONG).show()
            Toast.makeText(baseContext,Password,Toast.LENGTH_LONG).show()
            Toast.makeText(baseContext,ConfirmPassword,Toast.LENGTH_LONG).show()

        }

    }
}