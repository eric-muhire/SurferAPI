package com.grupparbete.PostControllers;

import com.grupparbete.school.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/post")
public class PostsController {

Map<Integer, Post> post=new HashMap<Integer,Post>();
        @GetMapping("/")
        public Collection<Post> getAll() {
            return post.values();


    }
}
