package com.base.domain

import java.util.Date

data class Publication(
    val id: Long,
    val title: String,
    val subTitle: String,
    val author: String,
    val body: String,
    val imageUrl: String,
    val date: Date,
    val likes: Int,
)