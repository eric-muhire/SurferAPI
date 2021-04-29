package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Update Beach Request")
@Data
public class UpdateBeachRequest {
    @ApiModelProperty(notes = "Name of the beach")
    private String beachName;

}
