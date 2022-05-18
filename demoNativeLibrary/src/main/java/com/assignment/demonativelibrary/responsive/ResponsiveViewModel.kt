package com.assignment.demonativelibrary.responsive

import androidx.lifecycle.ViewModel

class ResponsiveViewModel(private val repository: ResponsiveRepository):ViewModel() {

    fun getTheFacts() =
        repository.getTestData()
}