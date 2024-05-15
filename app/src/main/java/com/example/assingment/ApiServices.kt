package com.example.assingment

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("api/login")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @GET("api/users")
    fun getUsers(@Query("page") page: Int): Call<UsersResponse>

}
