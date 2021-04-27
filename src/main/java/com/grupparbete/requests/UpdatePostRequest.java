package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Update post Request")
public class UpdatePostRequest {
    @ApiModelProperty(notes = "Update weather")
    private String weather;
    @ApiModelProperty(notes = "Update waves")
    private String waves;
    @ApiModelProperty(notes = "Date/time of the Update")
    private Date updatedAt;
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

    public void setWaves(String waves) {
        this.waves = waves;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
