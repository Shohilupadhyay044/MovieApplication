package com.example.mvvmmoviesassignment.Repositories

import com.example.mvvmmoviesassignment.Remote.ApiService
import com.example.mvvmmoviesassignment.Remote.Network
import com.example.mvvmmoviesassignment.Remote.Resource
import com.example.mvvmmoviesassignment.Remote.ResponseHandler
import com.example.saveo.model_saveo.ResponseSaveo


class Repository {

    val api= Network.getInstance().create(ApiService::class.java)

    val responseHandler = ResponseHandler()

    suspend fun getData(): Resource<ResponseSaveo> {
        try {
            val result  = api.getData()
            return responseHandler.handleSuccess(result)
        }catch (e:Exception){

            return responseHandler.handleException(e)
        }
    }
}