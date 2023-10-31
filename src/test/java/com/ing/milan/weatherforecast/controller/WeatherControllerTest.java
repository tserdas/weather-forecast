package com.ing.milan.weatherforecast.controller;

import com.ing.milan.weatherforecast.model.contract.WeatherResponse;
import com.ing.milan.weatherforecast.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherControllerTest {

    @InjectMocks
    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @Test
    void testGetWeatherData() {
        // Define test data and expectations
        String city = "TestCity";
        WeatherResponse expectedResponse = new WeatherResponse();
        expectedResponse.setCod("200"); // Set your expected response code

        // Mock the behavior of the WeatherService
        when(weatherService.fetchWeatherData(city)).thenReturn(expectedResponse);

        // Call the controller method
        WeatherResponse actualResponse = weatherController.getWeatherData(city);

        // Verify the results
        assertEquals(expectedResponse, actualResponse);
    }
}
