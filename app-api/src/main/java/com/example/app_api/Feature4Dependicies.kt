package com.example.app_api

import com.example.feature4_api.Feature4Repository

interface Feature4Dependencies {
    fun getFeature4Repository(): Feature4Repository
}