package com.grupparbete.services;


import com.grupparbete.entities.Beach;
import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class PostService {

    @Autowired
    private PostSqlRepository repository;
    @Autowired
    private BeachSqlRepository beachSqlRepository;

    @Autowired
    private UserSqlRepository userSqlRepository;

    public Collection<Post>getAll(){

        return repository.findAll();
    }
    public Post getById(long id) {

        return repository.findById(id).get();
    }
    public Post addPost(AddPostRequest request) {

        var beach=new Beach();
        beach.setBeachName(request.getBeachName());
        beach.setId(request.getId());
        beach=beachSqlRepository.save(beach);

        var user=new User();
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user.setId((int) request.getId());
        user=userSqlRepository.save(user);

        var post = new Post();
        post.setId(request.getId());
        post.setWeather(request.getWeather());
        post.setWaves(request.getWaves());
        post.setCreatedAt(new Date());
        post.setUpdatedAt(request.getCreatedAt());


      //  post.setUser(user); (to use later)

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
        repository.deleteById(id);

    }
}
