package com.taghavi.cryptocurrencytest.domain.model

import com.taghavi.cryptocurrencytest.data.remote.dto.Team

data class CoinDetails(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<Team>
)