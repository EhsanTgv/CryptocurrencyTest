package com.taghavi.cryptocurrencytest.presentation.coinList

import com.taghavi.cryptocurrencytest.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
