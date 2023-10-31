package com.ing.milan.weatherforecast.controller;

import com.ing.milan.weatherforecast.model.contract.WeatherResponse;
import com.ing.milan.weatherforecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather-forecast")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "/get/next48")
    public WeatherResponse getWeatherData(@RequestParam(required = true) String city){return weatherService.fetchWeatherData(city);}

}
