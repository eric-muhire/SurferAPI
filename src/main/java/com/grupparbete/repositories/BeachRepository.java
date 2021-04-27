package com.grupparbete.repositories;

import com.grupparbete.entities.Beach;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class BeachRepository {

    Map<UUID, Beach> beaches=new HashMap<>();
    public Collection<Beach> getAll(){

        return beaches.values();
    }
    public Beach getById (UUID id){

        return beaches.get(id);
    }
    public Beach addBeach(Beach beach){
        beaches.put(beach.getId(),beach);
        return beaches.get(beach.getId());
    }
    public Beach updateBeach(UUID id, Beach beach){
        beaches.put(id, beach);
        return beaches.get(id);
    }
    public void deleteBeach (UUID id) {
        beaches.remove(id);

    }

}

