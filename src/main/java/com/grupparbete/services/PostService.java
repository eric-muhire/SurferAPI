package com.grupparbete.services;


import com.grupparbete.entities.Post;
import com.grupparbete.repositories.PostInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostService {
    @Autowired
    private PostInMemoryRepository postRepository;

    public Collection<Post>getAll(){
        return postRepository.getAll();
    }
    public Post getById(Long id) {
        return postRepository.getById(id);
    }
    public Post addPost(Post post) {
        return postRepository.addPost(post);
    }
    public Post updatePost(Long id,Post post){
        return postRepository.updatePost(id, post);

    }
    public void deletePost(Long id){
        postRepository.deletePost(id);

    }
}
