package den.project.news.presentation.di

import den.project.news.presentation.vievmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModelsModule = module {

    viewModel() {
        HomeViewModel()
    }
}