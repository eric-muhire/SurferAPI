package com.grupparbete.services;

import com.grupparbete.entities.Beach;
import com.grupparbete.repositories.BeachRepository;
import com.grupparbete.requests.AddBeachRequest;
import com.grupparbete.requests.UpdateBeachRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BeachService {
    @Autowired
    private BeachRepository beachRepository;

    public Collection<Beach> getAll() {

        return beachRepository.getAll();
    }

    public Beach getById(long id) {

        return beachRepository.getById(id);

    }

    public Beach addBeach(AddBeachRequest request, long id){
        var beach = new Beach();
        beach.setId(id);
        beach.setBeachName(request.getBeachName());

        return beachRepository.addBeach(beach);
    }
    public Beach updateBeach (long id, UpdateBeachRequest request){
        var beach = beachRepository.getById(id);
        beach.setBeachName(request.getBeachName());

        return beachRepository.updateBeach(id, beach);
    }
    public void deleteBeach (long id){
        beachRepository.deleteBeach(id);
    }

}
