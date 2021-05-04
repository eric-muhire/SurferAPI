package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(description = "This is the post model",
        value = "Post Model")
@Data
@NoArgsConstructor
public class Post {
    @ApiModelProperty(notes = "Unique identifier for post")
    private long id;
    @ApiModelProperty(notes = "Information about weather")
    private String weather;
    @ApiModelProperty(notes = "Information about waves")
    private String waves;
    @ApiModelProperty(notes = "Unique identifier for beach")
    private int beachId;
    @ApiModelProperty(notes = "The date when a post was created")
    private Date createdAt;
    @ApiModelProperty(notes = "The date when a post was last updated")
    private Date updatedAt;
    //@ApiModelProperty(notes = "Unique identifier for user")
   // private int userId;

    private User user;

}
