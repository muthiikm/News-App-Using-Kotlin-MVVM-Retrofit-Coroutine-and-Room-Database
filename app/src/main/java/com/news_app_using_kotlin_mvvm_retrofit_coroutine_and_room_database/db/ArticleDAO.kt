package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.models.Article
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models.Article

@Dao
interface ArticleDAO {
    //inserting data in to the database
    @Insert(onConflict = OnConflictStrategy.REPLACE) //to avoid conflicting data.Replace with the new data
    suspend fun upsert(article: Article):Long /* update/insert the 'article' in the database 'Article'
    suspend key means it must be called from a coroutine, lastly returning Long.
    */


    @Query("SELECT * FROM articles") // select favourite articles from the table articles
    fun getAllArticles():LiveData<List<Article>> // get all articles of type LiveData containing a list of all articles in the database

    @Delete()
    suspend fun deleteArticle(article: Article)

}