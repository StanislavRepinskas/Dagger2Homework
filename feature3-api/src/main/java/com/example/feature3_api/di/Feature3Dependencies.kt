package com.example.feature3_api.di

import com.example.feature3_api.Feature3Interactor

interface Feature3DependenciesProvider {
    fun getFeature3Dependencies(): Feature3Dependencies
}

interface Feature3Dependencies {
    fun getFeature3Interactor(): Feature3Interactor
}