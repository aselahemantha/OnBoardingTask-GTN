package com.example.base_sdk.domain.repository

import com.example.base_sdk.domain.model.PortfolioEntity

interface PortfolioRepository {
    fun getPortfolio(): PortfolioEntity
}