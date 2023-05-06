package com.example.dagger2concepts

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(email: String, from: String, data: String){
        Log.e("Email Sent", email)
    }
}