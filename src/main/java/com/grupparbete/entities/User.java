package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@ApiModel(description = "This is the User Model",value ="User model")

@Data
@NoArgsConstructor
@Entity
@Table(name = "[User]")
public class User {
    @ApiModelProperty(notes = "Unique identifier for User")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
    @Column(name = "id")
    private int id;

    private String userName;
    private String userEmail;

}


