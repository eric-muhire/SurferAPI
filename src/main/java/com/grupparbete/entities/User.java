package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "This is the User Model",value ="User model")

@Data
@NoArgsConstructor
public class User {
    @ApiModelProperty(notes = "Unique identifier for User")
    private int userId;
    private String userName;
    private String userEmail;

}


