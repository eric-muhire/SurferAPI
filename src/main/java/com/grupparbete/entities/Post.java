package com.grupparbete.entities;

import java.util.Date;
import java.util.UUID;

public class Post {

    private UUID id;
    private String weather;
    private String waves;
    private int location;
    private Date createdAt;
    private Date updatedAt;

    public Post() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
