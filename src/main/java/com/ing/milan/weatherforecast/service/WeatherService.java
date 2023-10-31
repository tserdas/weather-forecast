package com.ing.milan.weatherforecast.service;

import com.ing.milan.weatherforecast.config.WeatherConfig;
import com.ing.milan.weatherforecast.model.contract.OpenWeatherResponse;
import com.ing.milan.weatherforecast.model.contract.WeatherResponse;
import com.ing.milan.weatherforecast.model.dto.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class WeatherService {

    @Autowired
    private WeatherConfig weatherConfig;

    public WeatherResponse fetchWeatherData(String city) {

        String apiKey = weatherConfig.getApiKey();
        String openWeatherMapBaseUrl = weatherConfig.getBaseUrl();
        String apiUrl = openWeatherMapBaseUrl + "?q=" + city + "&units=metric" + "&appid=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<OpenWeatherResponse> response = restTemplate.getForEntity(apiUrl, OpenWeatherResponse.class);
            if(!response.hasBody() || Objects.isNull(response.getBody())){
                return getResponseBodyNullEx();
            }
            return getResponse(response.getBody());
        } catch (
                HttpClientErrorException e) {
            return getResponseHttpClientEx(e.getStatusCode());
        }
    }

    private WeatherResponse getResponseBodyNullEx() {
        WeatherResponse response = new WeatherResponse();
        response.setCod(HttpStatusCode.valueOf(204).toString());
        return response;
    }

    private WeatherResponse getResponseHttpClientEx(HttpStatusCode httpStatusCode){
        WeatherResponse response = new WeatherResponse();
        response.setCod(httpStatusCode.toString());
        return response;
    }

    private WeatherResponse getResponse(OpenWeatherResponse openWeatherResponse){

        WeatherResponse response = new WeatherResponse();
        LocalDateTime firstDataTime =  openWeatherResponse.getList().get(0).getDt();

        for (LocalDateTime reference = firstDataTime; reference.isBefore(firstDataTime.plusDays(2)); reference = reference.plusHours(3)) {
            final LocalDateTime ref = reference;
            openWeatherResponse.getList().stream().filter(x -> x.getDt().equals(ref)).map(WeatherData::getMain).findFirst().ifPresent(x->response.getDataList().add(x));
        }
        response.setCod(HttpStatusCode.valueOf(200).toString());
        return response;
    }

}
