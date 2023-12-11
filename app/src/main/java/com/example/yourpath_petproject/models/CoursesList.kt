package com.example.yourpath_petproject.models

import android.graphics.Color
import android.media.Image
import java.text.DateFormat
import java.text.NumberFormat

// класс данных курсов

data class CoursesList(
    val id: Int,
    val type: Int,
    val image: Image,
    val title: String,
    val date: String,
    val format: String,
    val price: Double,
    val color: Color,
    val description: String,
) {
// метод получения цены, включая форматирование
    fun getFormattedPrice(): String = NumberFormat.getNumberInstance().format(price)
}

