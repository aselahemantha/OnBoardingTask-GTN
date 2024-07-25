package com.example.base_sdk.di

import com.example.base_sdk.data.repository.PortfolioRepositoryImp
import com.example.base_sdk.domain.repository.PortfolioRepository
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
}