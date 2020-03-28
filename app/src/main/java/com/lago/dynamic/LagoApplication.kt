package com.lago.dynamic

import com.lago.dynamic.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class LagoApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

}