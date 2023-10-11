package com.example.nytarticles

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticleApi {
    @GET("mostviewed/all-sections/7.json")
    fun getMostPopularArticles(@Query("api-key") apiKey: String): Call<ArticleResponse>
}
