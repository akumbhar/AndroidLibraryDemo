package com.assignment.demonativelibrary.responsive

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
class FactViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        var repository = ResponsiveRepository()
        return ResponsiveViewModel(repository) as T
    }
}