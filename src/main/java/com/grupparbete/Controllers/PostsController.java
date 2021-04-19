package com.grupparbete.Controllers;

import com.grupparbete.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.grupparbete.entities.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/posts")
public class PostsController {

    @Autowired
            private PostService postService;

        @GetMapping("/")
        public Collection<Post> getAll() {
            return postService.getAll();
            
    }
    @GetMapping ("/{id}")
    public Post getById (@PathVariable long id) {
            return postService.getById(id);
    }
    @PostMapping("/")
    public Post addNewPost(@RequestBody Post post){
            return postService.addPost(post);
    }
    @PutMapping ("/{id}")
    public Post updatePost(@PathVariable long id, @RequestBody Post updatedPost){

            return postService.updatePost(id, updatedPost);
    }
    @DeleteMapping ("/{id}")
    public void deletePost (@PathVariable Long id) {
            postService.deletePost(id);
    }

}
