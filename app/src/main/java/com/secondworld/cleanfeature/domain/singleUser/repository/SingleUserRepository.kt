package com.secondworld.cleanfeature.domain.singleUser.repository

import com.secondworld.cleanfeature.domain.base.BaseResult
import com.secondworld.cleanfeature.domain.base.Failure
import com.secondworld.cleanfeature.domain.singleUser.entity.SingleUserDomain
import kotlinx.coroutines.flow.Flow

interface SingleUserRepository {

    suspend fun fetchSingleUser() : Flow<BaseResult<SingleUserDomain, Failure>>
}