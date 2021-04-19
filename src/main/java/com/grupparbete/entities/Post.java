package com.grupparbete.entities;

import java.util.Date;

public class Post {

    private long id;
    private String weather;
    private String waves;
    private int location;
    private Date createdAt;
    private Date updatedAt;


    public Post (Long id, String weather, String waves, int location,Date createdAt,Date updatedAt) {
        this.id = id;
        this.weather = weather;
        this.waves = waves;
        this.location = location;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
