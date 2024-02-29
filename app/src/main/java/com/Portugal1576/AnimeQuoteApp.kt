package com.Portugal1576

import android.app.Application
import com.Portugal1576.data.RepositoryImpl
import com.Portugal1576.domain.Repository
import com.Portugal1576.presentation.MainViewModel
import com.Portugal1576.presentation.ProvideViewModel

class AnimeQuoteApp: Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()
        val repository: Repository = RepositoryImpl()
        viewModel = MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {

        return viewModel
    }
}