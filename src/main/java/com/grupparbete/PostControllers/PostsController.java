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

Map<Integer, Post> posts=new HashMap<Integer,Post>();
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
            posts.put((int) post.getId(),post);
            return post;

    }
}
