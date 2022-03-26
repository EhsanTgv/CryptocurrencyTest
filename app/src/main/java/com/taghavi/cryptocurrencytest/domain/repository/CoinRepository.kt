package com.taghavi.cryptocurrencytest.domain.repository

import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDetailsDto
import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailsDto
}