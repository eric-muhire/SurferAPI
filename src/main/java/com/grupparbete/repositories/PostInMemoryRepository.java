package com.grupparbete.repositories;

import com.grupparbete.entities.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class PostInMemoryRepository {
    Map<UUID, Post> posts=new HashMap<UUID, Post>();
    public Collection<Post> getAll(){
        return posts.values();

    }
    public Post getById(UUID id){
        return posts.get(id);
    }
public Post addPost(Post post){
        posts.put(post.getId(),post);
        return posts.get(post.getId());
}
public Post updatePost(UUID id, Post post){
        posts.put(id, post);
        return posts.get(id);
}
public void deletePost(UUID id){
        posts.remove( id);
}

}
