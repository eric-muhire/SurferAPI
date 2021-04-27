package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Add new User Request")

public class AddUserRequest {

    @ApiModelProperty(notes = "The id of the user")
    private int userId;

    @ApiModelProperty(notes = "The name of the user")
    private String userName;

    @ApiModelProperty(notes = "The user´s  e-mail")
    private String userEmail;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

