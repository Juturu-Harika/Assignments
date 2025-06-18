package com.example.WeatherForecast.model;

import java.time.LocalDate;

public class WeatherForecast {
    private LocalDate date;
    private double temperature;
    private double precipitation;

    public WeatherForecast() {}

    public WeatherForecast(LocalDate date, double temperature, double precipitation) {
        this.date = date;
        this.temperature = temperature;
        this.precipitation = precipitation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }
}