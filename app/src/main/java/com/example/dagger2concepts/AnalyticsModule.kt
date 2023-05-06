package com.example.dagger2concepts

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getMixpanelAnalytics() : AnalyticsService {
        return MixpanelAnalytics()
    }


}