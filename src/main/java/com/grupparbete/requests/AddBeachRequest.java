package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

@ApiModel(description = "Add a new beach request")
public class AddBeachRequest {
    @ApiModelProperty(notes = "The ID number of the beach")
    private UUID id;
    @ApiModelProperty(notes = "Name of the beach")
    private String beachName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }
}
