package com.example.basicroomapp.database

import android.app.Application

open class MyApplication: Application() {
    override fun onCreate() {
        DatabaseManager.instance.initializeDB(applicationContext)
        super.onCreate()
    }
}