package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models.Source
import java.io.Serializable

@Entity(
    tableName = "articles")

data class ArticleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    @ColumnInfo("author")
    val author: String,

    @ColumnInfo("content")
    val content: String,

    @ColumnInfo("description")
    val description: String,

    @ColumnInfo("published_at")
    val publishedAt: String,

    @ColumnInfo("source")
    val source: Source,

    @ColumnInfo("title")
    val title: String,

    @ColumnInfo("url")
    val url: String,

    @ColumnInfo("url_to_image")
    val urlToImage: String
): Serializable


