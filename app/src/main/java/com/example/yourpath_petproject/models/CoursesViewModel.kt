package com.example.yourpath_petproject.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.yourpath_petproject.data.CourseDataSource
import java.text.NumberFormat

class CoursesViewModel : ViewModel() {

    val coursesList = CourseDataSource.coursesList

    // Значение по умолчанию цен на курсы

    private var courseGoalPrice = 0.0
    private var courseEmotionsPrice = 0.0
    private var courseImpostorPrice = 0.0
    private var courseLovePrice = 0.0
    private var courseResourcePrice = 0.0
    private var courseOtherPrice = 0.0

    // курс целеполагание
    private val _goal = MutableLiveData<CoursesList>()
    val goal: LiveData<CoursesList> = _goal

    // курс эмоции
    private val _emotions = MutableLiveData<CoursesList>()
    val emotions: LiveData<CoursesList> = _emotions

    // курс синдром самозванца
    private val _impostor = MutableLiveData<CoursesList>()
    val impostor: LiveData<CoursesList> = _impostor

    // курс любовь к себе
    private val _love = MutableLiveData<CoursesList>()
    val love: LiveData<CoursesList> = _love

    // курс ресурсы
    private val _resource = MutableLiveData<CoursesList>()
    val resource: LiveData<CoursesList> = _resource

    // курс другое
    private val _other = MutableLiveData<CoursesList>()
    val other: LiveData<CoursesList> = _other

    // стоимость курсов
    private val _totalCourses = MutableLiveData(0.0)
    val totalCourses: LiveData<String> = _totalCourses.map {
        NumberFormat.getCurrencyInstance().format(it)
    }

    // расчет стоимости курсов
    fun calcCourses() {

    }


    // сбросить все значения
    fun resetOrderCourses() {
        courseGoalPrice = 0.0
        courseEmotionsPrice = 0.0
        courseImpostorPrice = 0.0
        courseLovePrice = 0.0
        courseResourcePrice = 0.0
        courseOtherPrice = 0.0
        _goal.value = null
        _emotions.value = null
        _impostor.value = null
        _love.value = null
        _resource.value = null
        _other.value = null
        _totalCourses.value = 0.0

    }
}