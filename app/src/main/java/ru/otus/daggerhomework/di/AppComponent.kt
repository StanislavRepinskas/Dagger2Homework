package ru.otus.daggerhomework.di

import android.content.Context
import com.example.app_api.di.AppComponentDependencies
import com.example.app_api.ApplicationContext
import com.example.feature3.di.Feature3Module
import com.example.feature3_api.di.Feature3ComponentDependencies
import com.example.feature4_api.di.Feature4ComponentDependencies
import com.example.feature4.di.Feature4Module
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        Feature3Module::class,
        Feature4Module::class
    ]
)
interface AppComponent :
    AppComponentDependencies,
    Feature3ComponentDependencies,
    Feature4ComponentDependencies {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance
            @ApplicationContext
            context: Context
        ): AppComponent
    }

    @ApplicationContext
    override fun provideApplicationContext(): Context

}
