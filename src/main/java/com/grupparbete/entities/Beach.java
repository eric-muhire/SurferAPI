package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This is the beach model",
        value = "Beach Model")
public class Beach {
    @ApiModelProperty(notes = "Unique Id and name of the beach")

        private int id;
        private String beachName;

    public Beach() {

    }

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


