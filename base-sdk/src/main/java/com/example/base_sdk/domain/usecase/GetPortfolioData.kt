package com.example.base_sdk.domain.usecase

import com.example.base_sdk.domain.model.PortfolioEntity

interface GetPortfolioData {
    fun getData(): PortfolioEntity
}