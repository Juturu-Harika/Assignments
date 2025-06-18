package com.example.WeatherForecast.controller;
import com.example.WeatherForecast.model.WeatherForecast;
import com.example.WeatherForecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast")
    public List<WeatherForecast> getForecast(@RequestParam double latitude, @RequestParam double longitude) {
        return weatherService.getForecast(latitude, longitude);
    }
    //http://localhost:8080/weather/forecast?latitude=12.9724&longitude=77.5806

    @GetMapping("/compare")
    public String compareForecasts(@RequestParam double lat1, @RequestParam double lon1,
                                   @RequestParam double lat2, @RequestParam double lon2) {
        List<WeatherForecast> forecast1 = weatherService.getForecast(lat1, lon1);
        List<WeatherForecast> forecast2 = weatherService.getForecast(lat2, lon2);
        return weatherService.compareForecasts(forecast1, forecast2);
    }
}