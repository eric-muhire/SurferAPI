package com.grupparbete.services;
import com.grupparbete.entities.Beach;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.UpdateBeachRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;


class BeachServiceTest {

    private BeachService sut;
    private BeachSqlRepository beachSqlRepository;
    private PostSqlRepository repository;
    private UserSqlRepository userSqlRepository;

    @BeforeEach

    void initTests(){

        this.repository= Mockito.mock(PostSqlRepository.class);
        this.beachSqlRepository=Mockito.mock(BeachSqlRepository.class);
        this.userSqlRepository=Mockito.mock(UserSqlRepository.class);

        this.sut=new BeachService(this.beachSqlRepository, this.repository, this.userSqlRepository);

    }

    @Test
    public void BeachService_updateBeach_Success(){

        //ARRANGE
        var beach=new Beach();
        beach.setId(1L);
        beach.setBeachName("test");
        Optional<Beach> beachMock;
        beachMock = Optional.of((Beach) beach);

        when(beachSqlRepository.findById(anyLong())).thenReturn(beachMock);
        when(beachSqlRepository.save(any(Beach.class))).thenReturn(beach);

        var updateBeachRequest=new UpdateBeachRequest();
        updateBeachRequest.setBeachName("TestBeach");


        //ACT
        var result=sut.updateBeach(1L, updateBeachRequest);

        //ASSERT
        assertEquals(updateBeachRequest.getBeachName(),result.getBeachName());

    }
}
