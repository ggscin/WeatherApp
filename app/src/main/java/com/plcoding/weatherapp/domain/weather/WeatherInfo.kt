package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataRerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
