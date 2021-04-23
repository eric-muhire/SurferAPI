package com.grupparbete.Controllers;


import com.grupparbete.entities.Post;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import com.grupparbete.services.PostService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    @ApiOperation(value = "Get all posts",
            notes = "Fetches all posts from the API",
    response = Post.class,
    responseContainer = "List")
    public Collection<Post> getAll() {
        return postService.getAll();
            
    }
    @GetMapping ("/{id}")
    @ApiOperation(value = "Get post by Id",
            notes = "Get post with a specific Id",
    response = Post.class)

    public Post getById (@ApiParam(value = "Id of the post",
            required = true) @PathVariable UUID id) {

        return postService.getById(id);
    }
    @PostMapping("/")
    @ApiOperation(value = "Add new post",
            notes = "Create a new post",
            response = Post.class)
    public Post addNewPost(@RequestBody AddPostRequest request){

            return postService.addPost(request);
    }
    @PutMapping ("/{id}")
    @ApiOperation(value = "Update post by Id",
            notes = "Id required to update post",
            response = Post.class)
    public Post updatePost(@ApiParam(value = "Id of the post", required = true)
                               @PathVariable UUID id, @RequestBody UpdatePostRequest request){

            return postService.updatePost(id, request);
    }
    @DeleteMapping ("/{id}")
    @ApiOperation(value = "Delete post by Id",
            notes = "Id required to delete post",
            response = Post.class)
    public void deletePost (@ApiParam(value = "Id of the post", required = true)
                                @PathVariable UUID id) {
            postService.deletePost(id);
    }

}
