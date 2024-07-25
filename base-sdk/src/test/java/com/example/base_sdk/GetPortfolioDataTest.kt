package com.example.base_sdk

import com.example.base_sdk.data.usecase.GetPortfolioDataImp
import com.example.base_sdk.domain.model.PortfolioEntity
import com.example.base_sdk.domain.repository.PortfolioRepository
import com.example.base_sdk.domain.usecase.GetPortfolioData
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetPortfolioDataTest {
    @Mock
    private lateinit var portfolioRepository: PortfolioRepository

    private lateinit var getPortfolioData: GetPortfolioData

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        getPortfolioData = GetPortfolioDataImp(portfolioRepository)
    }

    @Test
    fun getDataTestCase() {
        // Arrange
        val portfolioEntity = PortfolioEntity(
            212312.23,
            2.64,
            3.87,
            "AED"
        )
        Mockito.`when`(portfolioRepository.getPortfolio()).thenReturn(portfolioEntity)

        // Act
        val result = getPortfolioData.getData()

        // Assert
        assertEquals(portfolioEntity, result)
    }
}