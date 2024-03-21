package com.example.feature3.di

import com.example.feature3.Feature3InteractorImpl
import com.example.feature3_api.Feature3Interactor
import dagger.Binds
import dagger.Module

@Module
interface Feature3Module {
    @Binds
    fun bindFeature3Interactor(feature3InteractorImpl: Feature3InteractorImpl): Feature3Interactor
}
