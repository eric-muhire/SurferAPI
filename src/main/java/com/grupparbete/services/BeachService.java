package com.grupparbete.services;

import com.grupparbete.entities.Beach;
import com.grupparbete.repositories.BeachRepository;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.requests.AddBeachRequest;
import com.grupparbete.requests.UpdateBeachRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class BeachService {
    @Autowired

    private BeachSqlRepository beachRepository;

    public Collection<Beach> getAll() {
        return beachRepository.findAll();
    }

    public Beach getById(long id) {
        return beachRepository.findById(id).get();

    }

    public Beach addBeach(AddBeachRequest request, long id){
        var beach = new Beach();
        beach.setBeachName(request.getBeachName());
        return beachRepository.save(beach);

    }
    public Beach updateBeach (long id, UpdateBeachRequest request){
        var beach = beachRepository.getById(id);
        beach.setBeachName(request.getBeachName());
        return beachRepository.save(beach);
        
    }
    public void deleteBeach (long id){
        beachRepository.deleteById(id);
    }

}
