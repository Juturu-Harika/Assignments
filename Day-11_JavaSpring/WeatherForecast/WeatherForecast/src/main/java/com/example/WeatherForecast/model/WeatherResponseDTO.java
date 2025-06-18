package com.example.WeatherForecast.model;

import java.util.List;

public class WeatherResponseDTO {
    private Daily daily;

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public static class Daily {
        private List<String> time;
        private List<Double> temperature_2m_max;
        private List<Double> precipitation_sum;

        public List<String> getTime() {
            return time;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }

        public List<Double> getTemperature_2m_max() {
            return temperature_2m_max;
        }

        public void setTemperature_2m_max(List<Double> temperature_2m_max) {
            this.temperature_2m_max = temperature_2m_max;
        }

        public List<Double> getPrecipitation_sum() {
            return precipitation_sum;
        }

        public void setPrecipitation_sum(List<Double> precipitation_sum) {
            this.precipitation_sum = precipitation_sum;
        }
    }
}

