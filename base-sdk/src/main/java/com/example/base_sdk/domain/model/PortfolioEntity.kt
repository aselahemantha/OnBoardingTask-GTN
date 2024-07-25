package com.example.base_sdk.domain.model

data class PortfolioEntity (
    val value: Double,
    val change: Double,
    val changePercentage: Double,
    val name: String) {
}