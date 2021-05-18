package com.grupparbete.services;
import com.grupparbete.entities.Post;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.UpdatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Date;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;


class PostServiceTest {

    private PostService sut;
    private PostSqlRepository repository;
    private BeachSqlRepository beachSqlRepository;
    private UserSqlRepository userSqlRepository;

    @BeforeEach

    void initTests(){

        this.repository= Mockito.mock(PostSqlRepository.class);
        this.beachSqlRepository=Mockito.mock(BeachSqlRepository.class);
        this.userSqlRepository=Mockito.mock(UserSqlRepository.class);
        this.sut=new PostService(this.repository, this.beachSqlRepository,this.userSqlRepository);

    }

    @Test
    public void PostService_updatePost_Success(){

        //ARRANGE
        var post=new Post();
        post.setId(1L);
        post.setWeather("test");
        post.setWaves("test");
        post.setCreatedAt(new Date());
        Optional<Post> postMock;
        postMock = Optional.of((Post) post);

        when(repository.findById(anyLong())).thenReturn(postMock);
        when(repository.save(any(Post.class))).thenReturn(post);

        var updatePostRequest=new UpdatePostRequest();
        updatePostRequest.setWaves("high");
        updatePostRequest.setWeather("cold");
        updatePostRequest.setUpdatedAt(new Date());

        //ACT
        var result=sut.updatePost(1L, updatePostRequest);
        //ASSERT
        assertEquals(updatePostRequest.getWaves(),result.getWaves());
        assertEquals(updatePostRequest.getWeather(),result.getWeather());
        assertNotNull(result.getUpdatedAt());
    }
}

