package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@ApiModel(description = "This is the post model",
        value = "Post Model")
@Data
@NoArgsConstructor
public class Post {
    @ApiModelProperty(notes = "Unique identifier for post")
    private UUID id;
    private String weather;
    private String waves;
    private int beachId;
    private Date createdAt;
    private Date updatedAt;
    private int userId;

}
