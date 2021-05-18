package com.grupparbete.requests;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Update user Request")
@Data
public class UpdateUserRequest {

    @ApiModelProperty(notes = "The name of the user")
    private String userName;

    @ApiModelProperty(notes = "The user´s e-mail")
    private String userEmail;

}
