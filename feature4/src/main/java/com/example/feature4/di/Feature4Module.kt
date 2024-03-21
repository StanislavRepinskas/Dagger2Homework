package com.example.feature4.di

import com.example.feature4.Feature4RepositoryImpl
import com.example.feature4_api.Feature4Repository
import dagger.Binds
import dagger.Module

@Module
interface Feature4Module {
    @Binds
    fun bindFeature4Repository(feature4Repository: Feature4RepositoryImpl): Feature4Repository
}
