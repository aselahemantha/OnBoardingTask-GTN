package com.example.ui_library.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base_sdk.domain.model.PortfolioEntity
import com.example.base_sdk.domain.repository.PortfolioRepository
import com.example.base_sdk.domain.usecase.GetPortfolioData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PortfolioCardViewModel @Inject constructor(
    private val portfolioRepository: PortfolioRepository,
    private val getPortfolioData: GetPortfolioData
): ViewModel() {

    private val _portfolio = MutableStateFlow<PortfolioEntity?>(null)
    val portfolio: StateFlow<PortfolioEntity?> get() = _portfolio

    init {
        fetchPortfolio()
    }

    private fun fetchPortfolio() {
        viewModelScope.launch {
            _portfolio.value = getPortfolioData.getData()
        }
    }
}