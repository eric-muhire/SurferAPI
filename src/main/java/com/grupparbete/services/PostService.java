package com.grupparbete.services;


import com.grupparbete.entities.Beach;
import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class PostService {

    Logger logger= LoggerFactory.getLogger(PostService.class);
    @Autowired
    private PostSqlRepository repository;
    @Autowired
    private BeachSqlRepository beachSqlRepository;

    @Autowired
    private UserSqlRepository userSqlRepository;

    public Collection<Post>getAll(){
        Sort sort=Sort.by(Sort.Direction.ASC,"beach");

        return repository.findAll(sort);
    }
    public Post getById(long id) {

        return repository.findById(id).get();

    }
    public Post addPost(AddPostRequest request) {

        var user=new User();
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user.setId((int) request.getId());
        user=userSqlRepository.save(user);


        var beach=new Beach();
        beach.setBeachName(request.getBeachName());
        beach.setId(request.getId());

        beach=beachSqlRepository.save(beach);


        var post = new Post();
        post.setId(request.getId());
        post.setWeather(request.getWeather());
        post.setBeach(beach);
        post.setUser(user);
        post.setWaves(request.getWaves());
        post.setCreatedAt(new Date());
        post.setUpdatedAt(request.getCreatedAt());
        beachSqlRepository.findById(request.getId());
        userSqlRepository.findById((int) request.getId());

        return repository.save(post);
    }
    public Post updatePost(long id, UpdatePostRequest request){
        var post = repository.findById(id).get();
        post.setWeather(request.getWeather());
        post.setUpdatedAt(new Date());
        post.setWaves(request.getWaves());
        post.setUpdatedAt(new Date());
        return repository.save(post);

    }
    public void deletePost(long id){
        try{
            repository.deleteById(id);
            logger.info("Successfullt deleted post by id"+ id);
        }
        catch (Exception exception){
            logger.error(("Failed to delete post with id"));

        }

    }

}
