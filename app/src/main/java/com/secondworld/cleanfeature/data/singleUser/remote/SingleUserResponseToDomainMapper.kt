package com.secondworld.cleanfeature.data.singleUser.remote

import com.secondworld.cleanfeature.core.Mapper
import com.secondworld.cleanfeature.data.singleUser.remote.dto.SingleUserResponse
import com.secondworld.cleanfeature.domain.singleUser.entity.SingleUserDomain

class SingleUserResponseToDomainMapper : Mapper<SingleUserResponse, SingleUserDomain> {

    override fun map(data: SingleUserResponse): SingleUserDomain {
        return SingleUserDomain(
            data.data?.lastName,
            data.data?.id,
            data.data?.avatar,
            data.data?.firstName,
            data.data?.email
        )
    }
}