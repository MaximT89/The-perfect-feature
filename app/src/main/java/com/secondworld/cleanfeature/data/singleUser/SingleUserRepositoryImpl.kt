package com.secondworld.cleanfeature.data.singleUser

import com.secondworld.cleanfeature.data.singleUser.remote.SingleUserCloudDataSource
import com.secondworld.cleanfeature.domain.base.BaseResult
import com.secondworld.cleanfeature.domain.base.Failure
import com.secondworld.cleanfeature.domain.singleUser.entity.SingleUserDomain
import com.secondworld.cleanfeature.domain.singleUser.repository.SingleUserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SingleUserRepositoryImpl @Inject constructor(
    private val cloudDataSource: SingleUserCloudDataSource
) : SingleUserRepository {

    override suspend fun fetchSingleUser(): Flow<BaseResult<SingleUserDomain, Failure>> =
        flow {
            val result = cloudDataSource.fetchSingleUser()
            emit(result)
        }
}