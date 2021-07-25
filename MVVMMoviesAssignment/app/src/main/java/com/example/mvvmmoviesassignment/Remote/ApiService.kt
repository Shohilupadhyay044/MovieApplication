package com.example.mvvmmoviesassignment.Remote

import com.example.saveo.model_saveo.ResponseSaveo
import retrofit2.http.GET

interface ApiService {
    @GET("/search/shows?q=god")
   suspend fun getData(): ResponseSaveo

}