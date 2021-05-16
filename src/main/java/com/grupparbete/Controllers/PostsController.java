package com.grupparbete.Controllers;
import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import com.grupparbete.services.PostService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.Collection;
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/posts")
public class PostsController {

    Logger logger =LoggerFactory.getLogger(PostsController.class);
    private final PostService postService;

    @GetMapping("/log")
    public String testLogging(){

                 logger.trace ("Great Trace Logging");
                 logger.debug("Nice Debug Logging");
                 logger.info("Great Info Logging");
                 logger.warn("Nice Warn Logging");
                 logger.error("Good Error Logging");
                        return "Logging is working";
    }

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
            required = true) @PathVariable long id) {
        var response=postService.getById(id);
        if (response==null){
        logger.warn("Could not find post with id:"+id);
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "could not fin any post with provided ID");
        }
        return response;
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
                        @PathVariable long id, @RequestBody UpdatePostRequest request){
            return postService.updatePost(id, request);
    }
    
    @DeleteMapping ("/{id}")
    @ApiOperation(value = "Delete post by Id",
            notes = "Id required to delete post",
            response = Post.class)
    public void deletePost (@ApiParam(value = "Id of the post", required = true)
                                @PathVariable long id) {
            postService.deletePost(id);

    }

    }


