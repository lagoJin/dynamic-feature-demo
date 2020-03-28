package com.lago.dynamic.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Module
class ApiComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApiComponent
    }

    companion object {
        fun factory(): Factory = DaggerApiComponent.factory()
    }

}