package com.example.feature4

import com.example.feature4_api.Feature4Repository
import javax.inject.Inject

class Feature4RepositoryImpl @Inject constructor() : Feature4Repository {
    override fun getInt(): Int {
        return 0
    }
}