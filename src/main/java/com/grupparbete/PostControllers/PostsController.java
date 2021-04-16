package com.grupparbete.PostControllers;

import org.springframework.web.bind.annotation.*;

import com.grupparbete.entities.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/posts")
public class PostsController {

Map<Long, Post> posts=new HashMap<Long,Post>();
        @GetMapping("/")
        public Collection<Post> getAll() {
            return posts.values();
            
    }
    @GetMapping ("/{id}")
    public Post getById (@PathVariable long id) {
            return posts.get(id);
    }
    @PostMapping("/")
    public Post addNewPost(@RequestBody Post post){
            posts.put((long) post.getId(),post);
            return post;
    }
    @PutMapping ("/{id}")
    public Post updatePost(@PathVariable long id,
                           @RequestBody Post updatedPost){
            Post post = posts.get(id);
            post.setLocation(updatedPost.getLocation());
            post.setWaves(updatedPost.getWaves());
            post.setWeather(updatedPost.getWeather());
            return post;
    }
    @DeleteMapping ("/{id}")
    public void deletePost (@PathVariable long id) {
            posts.remove(id);
    }

}
