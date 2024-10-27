package com.example.terrariumapp1710;

public class Terrarium {
    private String name;
    private int temperature;
    private int humidity;

    public Terrarium(String name, int humidity, int temperature){
        this.name = name;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
