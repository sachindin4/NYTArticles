package com.example.nytarticles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ArticleViewModel : ViewModel() {
    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>> get() = _articles

    // Content of Selected article
    private val _selectedArticle = MutableLiveData<Article>()
    val selectedArticle: LiveData<Article>
        get() = _selectedArticle

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.nytimes.com/svc/mostpopular/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api = retrofit.create(ArticleApi::class.java)

    fun fetchArticles(apiKey: String) {
        api.getMostPopularArticles(apiKey).enqueue(object : Callback<ArticleResponse> {
            override fun onResponse(call: Call<ArticleResponse>, response: Response<ArticleResponse>) {
                if (response.isSuccessful) {
                    _articles.value = response.body()?.results
                }
            }

            override fun onFailure(call: Call<ArticleResponse>, t: Throwable) {
                // Handle the error
            }
        })
    }
}
