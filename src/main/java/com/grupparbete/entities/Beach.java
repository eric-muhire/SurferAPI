package com.grupparbete.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@ApiModel(description = "This is the beach model",
        value = "Beach Model")
@Data
@NoArgsConstructor
public class Beach {
    @ApiModelProperty(notes = "Unique Id and name of the beach")

        private UUID id;

        private String beachName;

}


