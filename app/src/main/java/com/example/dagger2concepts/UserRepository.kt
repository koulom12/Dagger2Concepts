package com.example.dagger2concepts

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String) {
        Log.e("Save User", email)
    }
}