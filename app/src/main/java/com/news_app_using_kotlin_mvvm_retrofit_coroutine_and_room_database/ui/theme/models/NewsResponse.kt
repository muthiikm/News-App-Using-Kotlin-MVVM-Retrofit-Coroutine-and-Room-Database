package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)