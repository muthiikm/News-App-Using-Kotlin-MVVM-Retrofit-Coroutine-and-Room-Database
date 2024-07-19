package com.news_app_using_kotlin_mvvm_retrofit_coroutine_and_room_database.util

sealed class Resource<T>(
    var message: String? = null,
    var data: T? = null
) {
    class Success<T>(data: T): Resource<T>(data = data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data=data, message=message)
    class Loading<T>: Resource<T>()

}