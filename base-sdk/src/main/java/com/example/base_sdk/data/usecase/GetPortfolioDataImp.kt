package com.example.base_sdk.data.usecase

import com.example.base_sdk.domain.model.PortfolioEntity
import com.example.base_sdk.domain.repository.PortfolioRepository
import com.example.base_sdk.domain.usecase.GetPortfolioData
import javax.inject.Inject

class GetPortfolioDataImp @Inject constructor(
    private val portfolioRepository: PortfolioRepository
) : GetPortfolioData{
    override fun getData(): PortfolioEntity {
        return portfolioRepository.getPortfolio()
    }
}