package com.example.dagger2concepts

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e("Dagger Hero", "User Saved in DB")
    }
}


class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e("Dagger Hero", "User Saved in Firebase")
    }
}
