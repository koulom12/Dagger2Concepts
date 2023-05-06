package com.example.dagger2concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("koulom12@gmail.com", "3456789")
        emailService.send("123@gmail.com", "koulom12@gmail.com", "Hello")
    }
}