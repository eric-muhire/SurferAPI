package com.grupparbete.services;


import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.PostInMemoryRepository;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class PostService {
    @Autowired
    private PostInMemoryRepository postRepository;

    public Collection<Post>getAll(){

        return postRepository.getAll();
    }
    public Post getById(long id) {

        return postRepository.getById(id);
    }
    public Post addPost(AddPostRequest request) {

        User user=new User();
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user.setUserId(request.getUserId());

        var post = new Post();
        post.setId(request.getId());
        post.setWeather(request.getWeather());
        post.setWaves(request.getWaves());
        post.setCreatedAt(new Date());
        post.setUpdatedAt(request.getCreatedAt());


        post.setUser(user);

        return postRepository.addPost(post);
    }
    public Post updatePost(long id, UpdatePostRequest request){
        var post = postRepository.getById(id);
        post.setWeather(request.getWeather());
        post.setUpdatedAt(new Date());
        post.setWaves(request.getWaves());
        post.setUpdatedAt(new Date());
        return postRepository.updatePost(id, post);

    }
    public void deletePost(long id){
        postRepository.deletePost(id);

    }
}
