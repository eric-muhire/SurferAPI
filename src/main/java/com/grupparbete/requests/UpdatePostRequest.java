package com.grupparbete.requests;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@ApiModel(description = "Update post Request")
@Data
@NoArgsConstructor
public class UpdatePostRequest {
    
    @ApiModelProperty(notes = "Update weather")
    private String weather;
    @ApiModelProperty(notes = "Update waves")
    private String waves;
    @ApiModelProperty(notes = "Date/time of the Update")
    private Date updatedAt;
    @ApiModelProperty(notes = "The user's ID specification")
    private int userId;
    @ApiModelProperty(notes = "post comment")
    private String comments;

}
