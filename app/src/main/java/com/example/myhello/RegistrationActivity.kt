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
        btnRegister.setOnClickListener{
            var FirstName=etFirstName.text.toString()
            var LastName=etLastName.text.toString()
            var Email=etEmail.text.toString()
            var PhoneNumber=etPhoneNumber.text.toString()
            var Password=etPassword.text.toString()
            var ConfirmPassword=etConfirmPassword.text.toString()
            Toast.makeText(baseContext,LastName,Toast.LENGTH_SHORT).show()

        }

    }
}