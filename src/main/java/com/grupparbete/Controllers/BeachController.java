package com.grupparbete.Controllers;

import com.grupparbete.entities.Beach;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/beaches")
public class BeachController {

Map<Long, Beach> beaches =new HashMap<Long, Beach>();
        @GetMapping("/")
        public Collection<Beach> getAll() {
            return beaches.values();
            
    }
    @GetMapping ("/{beachId}")
    public Beach getByBeachId (@PathVariable long beachId) {
            return beaches.get(beachId);
    }
    @PostMapping("/")
    public Beach addNewBeach(@RequestBody Beach beach){
            beaches.put((long) beach.getBeachId(),beach);
            return beach;
    }
    @PutMapping ("/{beachId}")
    public Beach updateBeach(@PathVariable long beachId,
                           @RequestBody Beach updatedBeach){
            Beach beach = beaches.get(beachId);
           beach.setBeachId(updatedBeach.getBeachId());
         beach.setBeachName(updatedBeach.getBeachName());
            return beach;
    }
    @DeleteMapping ("/{beachId}")
    public void deleteBeach (@PathVariable long beachId) {
            beaches.remove(beachId);
    }

}
