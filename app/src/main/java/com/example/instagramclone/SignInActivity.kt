package com.example.instagramclone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var et_email = findViewById(R.id.editTextEmail) as EditText
        var et_password = findViewById(R.id.editTextPassword) as EditText
        var btn_signin = findViewById(R.id.buttonSignIn) as Button
        var btn_signup = findViewById(R.id.textAccount) as TextView

        btn_signup.setOnClickListener() {
            setContentView(R.layout.activity_sign_up)
        }

        btn_signin.setOnClickListener() {
            setContentView(R.layout.activity_main)
        }
    }


}