package com.example.base_sdk.di

import com.example.base_sdk.data.repository.PortfolioRepositoryImp
import com.example.base_sdk.domain.repository.PortfolioRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindPortfolioRepository(
        portfolioRepositoryImp: PortfolioRepositoryImp
    ): PortfolioRepository
}