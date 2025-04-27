package com.example.DTO;

public class WeatherDTO {
    private String city;
    private double temperature;
    private int humidity;
    private String condition;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public WeatherDTO(String city, double temperature, int humidity, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }
}
