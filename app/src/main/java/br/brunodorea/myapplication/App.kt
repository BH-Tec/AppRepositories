package br.brunodorea.myapplication

import android.app.Application
import br.brunodorea.myapplication.data.di.DataModule
import br.brunodorea.myapplication.domain.di.DomainModule
import br.brunodorea.myapplication.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}