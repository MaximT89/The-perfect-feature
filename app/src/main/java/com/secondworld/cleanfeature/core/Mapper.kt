package com.secondworld.cleanfeature.core

import com.secondworld.cleanfeature.data.singleUser.remote.dto.SingleUserResponse

interface Mapper<T, R> {

    fun map(data: T): R
}