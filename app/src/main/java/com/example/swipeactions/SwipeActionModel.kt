package com.example.swipeactions

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SwipeActionModel:ViewModel() {

    private val _isExpand = MutableStateFlow(false)
    val isExpand: MutableStateFlow<Boolean> get() = _isExpand



    fun toggleSwipe(){
        _isExpand.value = _isExpand.value.not()
    }

    fun expand(){
        _isExpand.value = true
    }

    fun collapse(){
        _isExpand.value = false
    }
}