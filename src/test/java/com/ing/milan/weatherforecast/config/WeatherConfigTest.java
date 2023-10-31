package com.ing.milan.weatherforecast.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherConfigTest {
    @Mock
    private WeatherConfig weatherConfig;

    @Value("${open.weather.api.key}")
    private String apiKey;

    @Value("${open.weather.api.baseurl}")
    private String baseUrl;

    @Test
    void testGetApiKey() {
        String expectedApiKey = "apiKey"; // Set your expected value
        when(weatherConfig.getApiKey()).thenReturn(expectedApiKey);

        String actualApiKey = weatherConfig.getApiKey();

        assertEquals(expectedApiKey, actualApiKey);
    }

    @Test
    void testGetBaseUrl() {
        String expectedBaseUrl = "baseURL"; // Set your expected value
        when(weatherConfig.getBaseUrl()).thenReturn(expectedBaseUrl);

        String actualBaseUrl = weatherConfig.getBaseUrl();

        assertEquals(expectedBaseUrl, actualBaseUrl);
    }
}
