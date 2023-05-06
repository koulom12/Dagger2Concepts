package com.example.dagger2concepts

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService
    fun getEmailService() : EmailService
}