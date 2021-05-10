package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@ApiModel(description = "This is the post model",
        value = "Post Model")
@Data
@NoArgsConstructor
@Entity
@Table(name="Post")

public class Post {

    @ApiModelProperty(notes = "Unique identifier for post")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
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

    @OneToOne
    @JoinColumn(name="beach_id")
    private Beach beach;
    //@ApiModelProperty(notes = "Unique identifier for user")
   // private int userId;

    @OneToOne
    @JoinColumn(name="user_id")
  private User user;




}
