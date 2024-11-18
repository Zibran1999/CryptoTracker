package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

fun interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}
