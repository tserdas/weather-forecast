package com.ing.milan.weatherforecast.model.contract;

import com.ing.milan.weatherforecast.model.dto.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WeatherResponse implements Serializable {

    private String cod;
    private List<Data> dataList;

    public WeatherResponse() {
        this.dataList = new ArrayList<>();
    }

    public WeatherResponse(String cod, List<Data> dataList) {
        this.cod = cod;
        this.dataList = dataList;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}
