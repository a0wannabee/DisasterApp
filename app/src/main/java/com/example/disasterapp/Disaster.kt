package com.example.disasterapp

import androidx.annotation.DrawableRes

data class Disaster(
    val nameDisaster: String = "",
    val disasterType: String = "",
    @DrawableRes val image: Int = 0
)
