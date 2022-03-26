package com.taghavi.cryptocurrencytest.data.repository

import com.taghavi.cryptocurrencytest.data.remote.CoinPaprikaApi
import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDetailsDto
import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDto
import com.taghavi.cryptocurrencytest.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailsDto {
        return api.getCoinByID(coinId)
    }


}