package com.grupparbete.services;


import com.grupparbete.entities.Post;
import com.grupparbete.repositories.PostInMemoryRepository;
import com.grupparbete.requests.AddPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private PostInMemoryRepository postRepository;

    public Collection<Post>getAll(){
        return postRepository.getAll();
    }
    public Post getById(UUID id) {
        return postRepository.getById(id);
    }
    public Post addPost(AddPostRequest request) {

        var post = new Post();
        post.setId(UUID.randomUUID());
        post.setWeather(request.getWeather());
        post.setWaves(request.getWaves());


        return postRepository.addPost(post);
    }
    public Post updatePost(UUID id, Post post){
        return postRepository.updatePost(id, post);

    }
    public void deletePost(UUID id){
        postRepository.deletePost(id);

    }
}
