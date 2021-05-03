package com.grupparbete.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description = "Add a new post Request")
@Data
@NoArgsConstructor
public class AddPostRequest {
    @ApiModelProperty(notes = "The weather description")
    private String weather;
    @ApiModelProperty(notes = "The waves description")
    private String waves;
    @ApiModelProperty(notes = "The location specification")
    private int beachId;
    @ApiModelProperty(notes = "The time/date of created post")
    private Date createdAt;
    @ApiModelProperty(notes = "The user's ID specification")
    private int userId;
    @ApiModelProperty(notes = "The specific ID for post")
    private long id;


}
