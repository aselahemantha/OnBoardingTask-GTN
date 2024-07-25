package com.example.ui_library.di

import com.example.base_sdk.data.repository.PortfolioRepositoryImp
import com.example.base_sdk.data.usecase.GetPortfolioDataImp
import com.example.base_sdk.domain.repository.PortfolioRepository
import com.example.base_sdk.domain.usecase.GetPortfolioData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePortfolioRepository(
    ): PortfolioRepository {
        return PortfolioRepositoryImp()
    }

    @Provides
    @Singleton
    fun provideGetPortfolioData(
        portfolioRepository: PortfolioRepository
    ): GetPortfolioData {
        return GetPortfolioDataImp(portfolioRepository)
    }
}