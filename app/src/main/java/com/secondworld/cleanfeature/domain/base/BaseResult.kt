package com.secondworld.cleanfeature.domain.base

import com.secondworld.cleanfeature.domain.singleUser.entity.SingleUserDomain

sealed class BaseResult<out T : Any , out R : Any> {
    class Success<T : Any>(val data: SingleUserDomain) : BaseResult<T, Nothing>()
    class Error<R : Any>(val err : R) : BaseResult<Nothing, R>()
}