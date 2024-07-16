package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.api

import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models.NewsResponse
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    //requests

    @GET("v2/top-headlines")
    //customizing the url
    suspend fun getHeadlines(
        @Query("country")
        countryCode:String="us",
        @Query("page")
        pageNumber:Int =1,
        @Query("apikey")
        apikey:String= API_KEY
        //response
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String,
        @Query("page")
        pageNumber: Int,
        @Query("apikey")
        apikey: String= API_KEY
        //response
    ): Response<NewsResponse>

}
