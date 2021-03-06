package com.grupparbete.entities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    //Many to one relation between post and beach
    @ManyToOne
    @JoinColumn(name="beach_id")
    private Beach beach;

    //one to one relation between post and User
    @OneToOne
    @JoinColumn(name="user_id")
  private User user;
    @ApiModelProperty(notes = "Comments from the user")
    @Column
    private String Comments;

}
