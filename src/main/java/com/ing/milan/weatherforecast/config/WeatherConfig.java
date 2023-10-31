package com.ing.milan.weatherforecast.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherConfig {

    @Value("${open.weather.api.key}")
    private String apiKey;
    @Value("${open.weather.api.baseurl}")
    private String baseUrl;

    public String getApiKey() {
        return apiKey;
    }
    public String getBaseUrl(){ return baseUrl;}

}
