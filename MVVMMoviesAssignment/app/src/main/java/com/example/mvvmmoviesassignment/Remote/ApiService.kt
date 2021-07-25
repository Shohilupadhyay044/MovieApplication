package com.example.mvvmmoviesassignment.Remote

import com.example.saveo.model_saveo.ResponseSaveo
import com.example.saveo.modelhorizontal.HorizonalClass
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("/search/shows?q=god")
   suspend fun getData(): ResponseSaveo


    @GET("shows?page=1")
    suspend fun getShowData(): List<HorizonalClass>
}