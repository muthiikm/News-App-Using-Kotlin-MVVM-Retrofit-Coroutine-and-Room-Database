package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kotlin.jvm.Volatile

@Database(
    entities = [ArticleEntity::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class ArticleDatabase: RoomDatabase() {

    abstract fun getArticleDao(): ArticleDAO

    companion object {

        // Volatile annotation ensures that changes made by one thread are immediately visible to other threads
        @Volatile
        private var instance: ArticleDatabase? = null
        private val LOCK = Any()

        // Custom invoke operator for the companion object
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).build()
    }
}
