package com.grupparbete.entities;

import java.time.LocalDate;

public class Post {

    private long id;
    private String weather;
    private String waves;
    private int location;
   // private LocalDate dateTime;

    public Post (Long id, String weather, String waves, int location) {
        this.id = id;
        this.weather = weather;
        this.waves = waves;
        this.location = location;
        //this.dateTime = dateTime;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWaves() {
        return waves;
    }

    public void setWaves(String waves) {
        this.waves = waves;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

   /* public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    } */
}
