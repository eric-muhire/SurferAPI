package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Add a new beach request")
public class AddBeachRequest {
    @ApiModelProperty(notes = "The ID number of the beach")
    private int id;
    @ApiModelProperty(notes = "Name of the beach")
    private String beachName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }
}
