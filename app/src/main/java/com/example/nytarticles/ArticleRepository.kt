package com.example.nytarticles

class ArticleRepository(private val articleViewModel: ArticleViewModel) {
    fun fetchArticles(apiKey: String) {
        articleViewModel.fetchArticles(apiKey)
    }
}
