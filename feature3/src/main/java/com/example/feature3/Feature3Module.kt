package com.example.feature3

import com.example.feature3_api.Feature3Interactor
import com.example.feature4_api.Feature4Repository
import dagger.Binds
import dagger.Module

@Module
interface Feature3Module {
    @Binds
    fun bindFeature3Interactor(feature3InteractorImpl: Feature3InteractorImpl): Feature3Interactor
}
