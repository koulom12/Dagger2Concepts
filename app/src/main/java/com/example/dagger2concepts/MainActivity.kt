package com.example.dagger2concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var userRegistrationService : UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent
        val userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3, appComponent)
        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("koulom12@gmail.com", "3456789")
    }
}