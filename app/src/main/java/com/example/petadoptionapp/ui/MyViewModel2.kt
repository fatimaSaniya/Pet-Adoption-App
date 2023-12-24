package com.example.petadoptionapp.ui

import androidx.lifecycle.ViewModel
import com.example.petadoptionapp.data.Item
import com.example.petadoptionapp.data.Item2
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class UiState2(
    val selectedItem: Item?
)
class MyViewModel2() : ViewModel() {
    private var _uiState= MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun onItemSelected(item2: Item2){
        //_uiState.update { UiState(selectedItem = item) } or
        val item = null
        _uiState.value = UiState(selectedItem = item)
    }
}