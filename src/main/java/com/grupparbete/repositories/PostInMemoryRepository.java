package com.grupparbete.repositories;

import com.grupparbete.entities.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PostInMemoryRepository {
    Map<Long, Post> posts=new HashMap<Long, Post>();
    public Collection<Post> getAll(){
        return posts.values();

    }
    public Post getById(Long id){
        return posts.get(id);
    }
public Post addPost(Post post){
        posts.put(post.getId(),post);
        return posts.get(post.getId());
}
public Post updatePost(Long id,Post post){
        posts.put(id, post);
        return posts.get(id);
}
public void deletePost(Long id){
        posts.remove( id);
}

}
