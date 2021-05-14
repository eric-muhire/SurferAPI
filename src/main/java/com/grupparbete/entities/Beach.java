package com.grupparbete.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@ApiModel(description = "This is the beach model",
        value = "Beach Model")
@Data
@NoArgsConstructor
@Entity
@Table(name="Beach")
public class Beach {

    @ApiModelProperty(notes = "Unique identifier for beach")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "id")
    @Id
    private long id;

    @ApiModelProperty(notes = "Unique Name of the beach")
    @Column(name = "beachName")
    private String beachName;

//One to many relation between beach and post
    @JsonIgnore
@OneToMany(mappedBy = "beach")
private List <Post> posts;

}


