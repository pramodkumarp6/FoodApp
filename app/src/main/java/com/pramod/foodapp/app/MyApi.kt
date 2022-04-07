package com.pramod.foodapp.app

import com.pramod.foodapp.model.LoginResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface MyApi {

    @GET("allusers")
    suspend fun getDetails()
    @FormUrlEncoded
    @POST("/simple/public/userlogin")
    fun userLogin(@Field("email")email: String,
                  @Field("password")password:String): Call<LoginResponse>

    companion object{
        operator fun invoke():MyApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://big-name-interviewe.000webhostapp.com")
                .build()
                .create(MyApi::class.java)

        }
    }
}