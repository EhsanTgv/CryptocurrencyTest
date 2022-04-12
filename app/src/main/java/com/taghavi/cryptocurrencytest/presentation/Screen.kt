package com.taghavi.cryptocurrencytest.presentation

sealed class Screen(val rout: String) {
    object CoinListString : Screen("coinListScreen")
    object CoinDetailsString : Screen("coinDetailsScreen")
}
