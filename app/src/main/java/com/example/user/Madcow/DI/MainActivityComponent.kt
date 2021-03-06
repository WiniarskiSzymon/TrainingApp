package com.example.user.Madcow.DI

import com.example.user.Madcow.View.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<MainActivity>()
}