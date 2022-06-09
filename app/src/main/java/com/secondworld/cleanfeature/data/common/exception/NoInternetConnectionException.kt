package com.secondworld.cleanfeature.data.common.exception

import java.io.IOException

class NoInternetConnectionException : IOException() {
    override val message: String = "You are offline"
}