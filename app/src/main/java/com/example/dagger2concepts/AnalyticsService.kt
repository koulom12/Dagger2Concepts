package com.example.dagger2concepts

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface AnalyticsService {
    fun createEvent(eventName: String, eventType: String)
}

@Singleton
class MixpanelAnalytics: AnalyticsService {
    override fun createEvent(eventName: String, eventType: String) {
        Log.e("Dagger Hero", "Mixpanel - $eventType - $eventName")
    }
}

class FirebaseAnalytics: AnalyticsService {
    override fun createEvent(eventName: String, eventType: String) {
        Log.e("Dagger Hero", "Firebase - $eventType - $eventName")
    }
}