package com.example.WeatherForecast.service;

import com.example.WeatherForecast.model.WeatherForecast;
import com.example.WeatherForecast.model.WeatherResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<WeatherForecast> getForecast(double latitude, double longitude) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                "&longitude=" + longitude +
                "&daily=temperature_2m_max,precipitation_sum&timezone=auto";

        WeatherResponseDTO response = restTemplate.getForObject(url, WeatherResponseDTO.class);
        List<WeatherForecast> result = new ArrayList<>();

        if (response != null && response.getDaily() != null) {
            List<String> dates = response.getDaily().getTime();
            List<Double> temps = response.getDaily().getTemperature_2m_max();
            List<Double> precipitation = response.getDaily().getPrecipitation_sum();

            for (int i = 0; i < dates.size(); i++) {
                result.add(new WeatherForecast(
                        LocalDate.parse(dates.get(i)),
                        temps.get(i),
                        precipitation.get(i)
                ));
            }
        }

        return result;
    }

    public String compareForecasts(List<WeatherForecast> city1, List<WeatherForecast> city2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Weather Comparison for 7 Days:\n");
        for (int i = 0; i < city1.size(); i++) {
            WeatherForecast w1 = city1.get(i);
            WeatherForecast w2 = city2.get(i);
            sb.append(String.format("%s - City1: %.1f°C, %.1fmm | City2: %.1f°C, %.1fmm\n",
                    w1.getDate(), w1.getTemperature(), w1.getPrecipitation(),
                    w2.getTemperature(), w2.getPrecipitation()));
        }
        return sb.toString();
    }
}