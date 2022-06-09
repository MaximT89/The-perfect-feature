package com.secondworld.cleanfeature.data.singleUser.remote

import com.secondworld.cleanfeature.data.common.exception.NoInternetConnectionException
import com.secondworld.cleanfeature.data.singleUser.remote.api.SingleUserApi
import com.secondworld.cleanfeature.domain.base.BaseResult
import com.secondworld.cleanfeature.domain.base.Failure
import com.secondworld.cleanfeature.domain.singleUser.entity.SingleUserDomain
import javax.inject.Inject

class SingleUserCloudDataSource @Inject constructor(
    private val api: SingleUserApi,
    private val mapper: SingleUserResponseToDomainMapper
) {

    suspend fun fetchSingleUser(): BaseResult<SingleUserDomain, Failure> {
        return try {
            val response = api.getSingleUser()
            if (response.isSuccessful) {
                val body = response.body()
                BaseResult.Success(mapper.map(body!!))
            } else {
                BaseResult.Error(Failure(response.code(), response.message()))
            }
        } catch (e: NoInternetConnectionException) {
            BaseResult.Error(Failure(0, e.message))
        } catch (e: Exception) {
            BaseResult.Error(Failure(-1, e.message.toString()))
        }
    }
}