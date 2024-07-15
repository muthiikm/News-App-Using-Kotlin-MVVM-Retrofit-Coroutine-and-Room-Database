package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)