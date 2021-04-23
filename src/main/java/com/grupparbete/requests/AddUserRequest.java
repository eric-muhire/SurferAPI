package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Add new User Request")

public class AddUserRequest {

    @ApiModelProperty(notes = "The id of the user")
    private int id;

    @ApiModelProperty(notes = "The name of the user")
    private String userName;

    @ApiModelProperty(notes = "The user´s  e-mail")
    private String userEmail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

