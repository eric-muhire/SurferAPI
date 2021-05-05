package com.grupparbete.repositories;

import com.grupparbete.entities.Beach;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BeachRepository {

    Map<Long, Beach> beaches=new HashMap<>();
    public Collection<Beach> getAll(){

        return beaches.values();
    }
    public Beach getById (long id){

        return beaches.get(id);
    }
    public Beach addBeach(Beach beach){
        beaches.put(beach.getId(),beach);
        return beaches.get(beach.getId());
    }
    public Beach updateBeach(long id, Beach beach){
        beaches.put(id, beach);
        return beaches.get(id);
    }
    public void deleteBeach (long id) {
        beaches.remove(id);

    }

}

