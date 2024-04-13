package com.nyandori.melodimix

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("X-RapidAPI-Key: 9dcaa850demsh0bf2cd92b8b9a3fp1bd8cejsnf0e054e0704b",
            "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query:String): Call<MyData>
}