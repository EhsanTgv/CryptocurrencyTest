package com.taghavi.cryptocurrencytest.domain.useCase.getCoin

import com.taghavi.cryptocurrencytest.common.Resource
import com.taghavi.cryptocurrencytest.data.remote.dto.toCoin
import com.taghavi.cryptocurrencytest.data.remote.dto.toCoinDetails
import com.taghavi.cryptocurrencytest.domain.model.Coin
import com.taghavi.cryptocurrencytest.domain.model.CoinDetails
import com.taghavi.cryptocurrencytest.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetails>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetails()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}