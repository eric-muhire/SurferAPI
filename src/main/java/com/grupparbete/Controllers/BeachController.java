package com.grupparbete.Controllers;


import com.grupparbete.entities.Beach;
import com.grupparbete.requests.AddBeachRequest;
import com.grupparbete.requests.UpdateBeachRequest;
import com.grupparbete.services.BeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/beach")
public class BeachController {
@Autowired
private BeachService beachService;
    @GetMapping("/")
    public Collection<Beach> getAll() {
        return beachService.getAll();
            
    }
    @GetMapping ("/{id}")
    public Beach getById (@PathVariable int id) {

        return beachService.getById(id);
    }
    @PostMapping("/")
    public Beach addNewBeach(@RequestBody AddBeachRequest request){

            return beachService.addBeach(request);
    }
    @PutMapping ("/{id}")
    public Beach updateBeach(@PathVariable int id,
                           @RequestBody UpdateBeachRequest request){

            return beachService.updateBeach(id,request);
    }
    @DeleteMapping ("/{id}")
    public void deleteBeach (@PathVariable int id) {

    beachService.deleteBeach(id);
    }

}
