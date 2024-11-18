package com.plcoding.cryptotracker.core.domain.util

import android.content.Context
import com.plcoding.cryptotracker.R

fun NetworkError.toString(context: Context): String {
    val resId = when (this) {
        NetworkError.REQUEST_TIMEOUT -> R.string.request_time_out
        NetworkError.TOO_MANY_REQUEST -> R.string.too_many_request
        NetworkError.NO_INTERNET -> R.string.no_internet
        NetworkError.SERVER_ERROR -> R.string.unknown_error
        NetworkError.SERIALIZATION -> R.string.serialize_error
        NetworkError.UNKNOWN -> R.string.unknown_error
    }
    return context.getString(resId)
}