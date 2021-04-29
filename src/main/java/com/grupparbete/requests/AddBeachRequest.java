package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Add a new beach request")
@Data
public class AddBeachRequest {

    @ApiModelProperty(notes = "Name of the beach")
    private String beachName;
}
