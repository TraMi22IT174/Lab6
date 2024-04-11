package com.example.lab6

import android.app.Application
import com.example.lab6.data.AppContainer
import com.example.lab6.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}