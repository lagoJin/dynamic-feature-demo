package com.lago.dynamic.di

import android.app.Application
import com.lago.dynamic.LagoApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ApiComponent::class,
        RepositoryModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<LagoApplication> {


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}