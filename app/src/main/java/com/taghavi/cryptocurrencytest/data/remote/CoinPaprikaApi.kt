package com.taghavi.cryptocurrencytest.data.remote

import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDetailsDto
import com.taghavi.cryptocurrencytest.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinByID(@Path("coinId") coinId: String): CoinDetailsDto
}