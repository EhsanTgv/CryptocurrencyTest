package com.taghavi.cryptocurrencytest.presentation

sealed class Screen(val route: String) {
    object CoinListScreen : Screen("coinListScreen")
    object CoinDetailsScreen : Screen("coinDetailsScreen")
}
