package com.example.dagger2concepts

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e("Dagger Hero", "User Saved in DB")
        analyticsService.createEvent("Save User", "Create")
    }
}


class FirebaseRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e("Dagger Hero", "User Saved in Firebase")
        analyticsService.createEvent("Save User", "Create")

    }
}
