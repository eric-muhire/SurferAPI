package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Add new User Request")

@Data
@NoArgsConstructor
public class AddUserRequest {

    @ApiModelProperty(notes = "The id of the user")
    private int id;

    @ApiModelProperty(notes = "The name of the user")
    private String userName;

    @ApiModelProperty(notes = "The user´s  e-mail")
    private String userEmail;

}

