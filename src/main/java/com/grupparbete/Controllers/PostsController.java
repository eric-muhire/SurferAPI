package com.grupparbete.Controllers;


import com.grupparbete.entities.Post;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import com.grupparbete.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

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
    public Post getById (@PathVariable UUID id) {
            return postService.getById(id);
    }
    @PostMapping("/")
    public Post addNewPost(@RequestBody AddPostRequest request){
            return postService.addPost(request);
    }
    @PutMapping ("/{id}")
    public Post updatePost(@PathVariable UUID id, @RequestBody UpdatePostRequest request){

            return postService.updatePost(id, request);
    }
    @DeleteMapping ("/{id}")
    public void deletePost (@PathVariable UUID id) {
            postService.deletePost(id);
    }

}
