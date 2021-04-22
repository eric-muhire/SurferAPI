package com.grupparbete.repositories;

import com.grupparbete.entities.Beach;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BeachRepository {

    Map<Integer, Beach> beaches=new HashMap<Integer, Beach>();
    public Collection<Beach> getAll(){

        return beaches.values();
    }
    public Beach getById (int id){

        return beaches.get(id);
    }
    public Beach addBeach(Beach beach){
        beaches.put(beach.getId(),beach);
        return beaches.get(beach.getId());
    }
    public Beach updateBeach(int id,Beach beach){
        beaches.put(id, beach);
        return beaches.get(id);
    }
    public void deleteBeach (int id) {
        beaches.remove(id);

    }

}

