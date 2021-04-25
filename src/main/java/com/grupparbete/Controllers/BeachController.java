package com.grupparbete.Controllers;


import com.grupparbete.entities.Beach;
import com.grupparbete.entities.Post;
import com.grupparbete.requests.AddBeachRequest;
import com.grupparbete.requests.UpdateBeachRequest;
import com.grupparbete.services.BeachService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/beach")
public class BeachController {
@Autowired
private BeachService beachService;
    @GetMapping("/")
    @ApiOperation(value = "Get all posts",
            notes = "Fetches all beaches from the API",
            response = Beach.class,
            responseContainer = "List")
    public Collection<Beach> getAll() {
        return beachService.getAll();
            
    }
    @GetMapping ("/{id}")
    @ApiOperation(value = "Get post by Id",
            notes = "Get beach with a specific Id",
            response = Beach.class)
    public Beach getById (@ApiParam(value = "Id of the beach",
            required = true) @PathVariable int id) {

        return beachService.getById(id);
    }
    @PostMapping("/")
    @ApiOperation(value = "Add new beach",
            notes = "Create a new beach",
            response = Beach.class)
    public Beach addNewBeach(@RequestBody AddBeachRequest request){

            return beachService.addBeach(request);
    }
    @PutMapping ("/{id}")
    @ApiOperation(value = "Update beach by Id",
            notes = "Id required to update beach",
            response = Post.class)
    public Beach updateBeach(@PathVariable int id,
                           @RequestBody UpdateBeachRequest request){

            return beachService.updateBeach(id,request);
    }
    @DeleteMapping ("/{id}")
    @ApiOperation(value = "Delete beach by Id",
            notes = "Id required to delete beach",
            response = Beach.class)
    public void deleteBeach (@ApiParam(value = "Id of the beach", required = true) @PathVariable int id) {

    beachService.deleteBeach(id);
    }

}
