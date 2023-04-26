package com.betulantep.bookstoreapp.data.retrofit

import com.betulantep.bookstoreapp.data.entities.BookEntity
import retrofit2.Call
import retrofit2.http.GET

interface AppRemoteDao {
    @GET("betulantep/JSONDataSet/main/BookDataSet.json")
    fun getAllBooks(): Call<List<BookEntity>>
}