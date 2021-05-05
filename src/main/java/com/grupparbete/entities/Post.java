package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@ApiModel(description = "This is the post model",
        value = "Post Model")
@Data
@NoArgsConstructor
@Entity
@Table(name="Post")

public class Post {
    @javax.persistence.Id
    @ApiModelProperty(notes = "Unique identifier for post")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @ApiModelProperty(notes = "Information about weather")
    @Column(name = "weather")
    private String weather;

    @ApiModelProperty(notes = "Information about waves")
    @Column(name = "waves")
    private String waves;

    @ApiModelProperty(notes = "The date when a post was created")
    @Column(name = "createdAt")
    private Date createdAt;

    @ApiModelProperty(notes = "The date when a post was last updated")
    @Column(name = "updatedAt")
    private Date updatedAt;


    //@ApiModelProperty(notes = "Unique identifier for user")
   // private int userId;

  //  private User user; (to use later)

}
