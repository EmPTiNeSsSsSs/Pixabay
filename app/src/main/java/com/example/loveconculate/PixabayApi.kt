package com.example.loveconculate

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {

    @GET("api/?key=30106488-b17a9c5403f0de7390d535840")
    fun getImages(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 10
    ): retrofit2.Call<PixabayModel>
}