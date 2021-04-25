package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Update Beach Request")
public class UpdateBeachRequest {
    @ApiModelProperty(notes = "Name of the beach")
    private String beachName;
    @ApiModelProperty(notes = "Get the name of the beach")
    public String getBeachName (){
        return beachName;
    }

    public void setBeachName (String beachName){
        this.beachName = beachName;
    }
}
