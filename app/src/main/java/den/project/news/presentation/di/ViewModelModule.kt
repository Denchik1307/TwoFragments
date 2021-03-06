package den.project.news.presentation.di

import den.project.news.presentation.vievmodel.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModelsModule = module {

    viewModel() {
        HomeViewModel()
    }
}