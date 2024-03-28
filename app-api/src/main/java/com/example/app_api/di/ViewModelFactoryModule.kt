package com.example.app_api.di

import androidx.lifecycle.ViewModelProvider
import com.example.app_api.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}