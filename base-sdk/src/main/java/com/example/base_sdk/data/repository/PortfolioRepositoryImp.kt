package com.example.base_sdk.data.repository

import com.example.base_sdk.domain.model.PortfolioEntity
import com.example.base_sdk.domain.repository.PortfolioRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PortfolioRepositoryImp(
) : PortfolioRepository {
    override fun getPortfolio(): PortfolioEntity {
        return PortfolioEntity(
            212312.23,
            2.64,
            3.87,
            "AED"
        )
    }

}