package com.secondworld.cleanfeature.data.singleUser.remote.api

import com.secondworld.cleanfeature.data.singleUser.remote.dto.SingleUserResponse
import retrofit2.Response
import retrofit2.http.GET

interface SingleUserApi {

    @GET("api/users/2")
    suspend fun getSingleUser() : Response<SingleUserResponse>
}