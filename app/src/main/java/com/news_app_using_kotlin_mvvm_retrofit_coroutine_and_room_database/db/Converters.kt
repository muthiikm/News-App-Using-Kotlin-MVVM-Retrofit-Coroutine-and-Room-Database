package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.db

import androidx.room.TypeConverter
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.models.Source
import com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.ui.theme.models.Source
import kotlin.contracts.Returns

class Converters {
    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }

    fun toSource(name:String): Source {

        return Source(name,name)
    }
}