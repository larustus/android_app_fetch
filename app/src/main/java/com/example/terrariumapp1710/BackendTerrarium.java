package com.example.terrariumapp1710;

public class BackendTerrarium {
    private Integer id;
    private String name;
    private Integer temperature_goal;
    private Integer humidity_goal;
    private Integer max_temp;
    private Integer min_temp;
    private Integer max_hum;
    private Integer min_hum;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTemperature_goal() {
        return temperature_goal;
    }

    public Integer getHumidity_goal() {
        return humidity_goal;
    }

    public Integer getMax_temp() {
        return max_temp;
    }

    public Integer getMin_temp() {
        return min_temp;
    }

    public Integer getMax_hum() {
        return max_hum;
    }

    public Integer getMin_hum() {
        return min_hum;
    }
}
