package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Add a new post Request")
public class AddPostRequest {
    @ApiModelProperty(notes = "The weather description")
    private String weather;
    @ApiModelProperty(notes = "The waves description")
    private String waves;
    @ApiModelProperty(notes = "The location specification")
    private int beachId;
    @ApiModelProperty(notes = "The time/date of created post")
    private Date createdAt;
    @ApiModelProperty(notes = "The user's ID specification")
    private int userId;


    public String getWeather() {

        return weather;
    }

    public void setWeather(String weather) {

        this.weather = weather;
    }

    public String getWaves() {

        return waves;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setWaves(String waves) {
        this.waves = waves;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getBeachId() {
        return beachId;
    }

    public void setBeachId(int beachId) {
        this.beachId = beachId;
    }



}
