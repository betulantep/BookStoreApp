package com.betulantep.bookstoreapp.data.entities

data class BookEntity(
    val book_id: String,
    val book_name: String,
    val book_author: String,
    val book_publisher: String,
    val book_category: String,
    val book_product_format: String,
    val book_price: String,
    val book_image_url: String
    )