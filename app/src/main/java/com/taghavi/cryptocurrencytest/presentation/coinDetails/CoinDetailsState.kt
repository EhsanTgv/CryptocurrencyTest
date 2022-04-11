package com.taghavi.cryptocurrencytest.presentation.coinDetails

import com.taghavi.cryptocurrencytest.domain.model.CoinDetails

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetails? = null,
    val error: String = ""
)

