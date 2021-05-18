package com.grupparbete.repositories;

import com.grupparbete.entities.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PostInMemoryRepository {
    Map<Long, Post> posts=new HashMap<>();
    public Collection<Post> getAll(){
        return posts.values();

    }
    public Post getById(long id){

        return posts.get(id);
    }
    public Post addPost(Post post){
        posts.put(post.getId(),post);
        return posts.get(post.getId());
    }
    public Post updatePost(long id, Post post){
        posts.put(id, post);
        return posts.get(id);
    }
    public void deletePost(long id){

        posts.remove(id);
}

}
