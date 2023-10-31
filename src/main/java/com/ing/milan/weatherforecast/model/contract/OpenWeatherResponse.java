package com.ing.milan.weatherforecast.model.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ing.milan.weatherforecast.model.dto.WeatherData;

import java.io.Serializable;
import java.util.List;

public class OpenWeatherResponse implements Serializable {

    private String cod;
    private int message;
    private int cnt;
    @JsonProperty("list")
    private List<WeatherData> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<WeatherData> getList() {
        return list;
    }

    public void setList(List<WeatherData> list) {
        this.list = list;
    }
}
