package com.example.dagger2concepts

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository) : UserRepository
}