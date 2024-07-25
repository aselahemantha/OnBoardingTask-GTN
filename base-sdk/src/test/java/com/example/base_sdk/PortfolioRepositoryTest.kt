package com.example.base_sdk

import com.example.base_sdk.data.repository.PortfolioRepositoryImp
import com.example.base_sdk.domain.model.PortfolioEntity
import com.example.base_sdk.domain.repository.PortfolioRepository
import org.junit.Test
import org.junit.Assert.*


class PortfolioRepositoryTest {

    @Test
    fun getPortfolioTestCase() {
        val repository: PortfolioRepository = PortfolioRepositoryImp()
        val expectedPortfolioEntity = PortfolioEntity(
            212312.23,
            2.64,
            3.87,
            "AED"
        )

        // Act
        val result = repository.getPortfolio()

        // Assert
        assertEquals(expectedPortfolioEntity, result)
    }
}