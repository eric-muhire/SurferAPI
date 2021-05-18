package com.grupparbete.services;
import com.grupparbete.entities.Beach;
import com.grupparbete.entities.Post;
import com.grupparbete.entities.User;
import com.grupparbete.repositories.BeachSqlRepository;
import com.grupparbete.repositories.PostSqlRepository;
import com.grupparbete.repositories.UserSqlRepository;
import com.grupparbete.requests.AddPostRequest;
import com.grupparbete.requests.UpdatePostRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    Logger logger = LoggerFactory.getLogger(PostService.class);

    private final PostSqlRepository repository;
    private final BeachSqlRepository beachSqlRepository;
    private final UserSqlRepository userSqlRepository;

    public Collection<Post> getAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "beach");

        return repository.findAll(sort);
    }

    public Post getById(Long id) {

        return repository.findById(id).get();

    }

    public Post addPost(AddPostRequest request) {

        var user = new User();
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getUserEmail());
        user.setId(request.getId());
        user = userSqlRepository.save(user);

        var beach = new Beach();
        beach.setBeachName(request.getBeachName());
        beach.setId(request.getId());
        beach = beachSqlRepository.save(beach);

        var post = new Post();
        post.setId(request.getId());
        post.setWeather(request.getWeather());
        post.setBeach(beach);
        post.setUser(user);
        post.setWaves(request.getWaves());
        post.setComments(request.getComments());
        post.setCreatedAt(new Date());
        post.setUpdatedAt(request.getCreatedAt());
        beachSqlRepository.findById(request.getId());
        userSqlRepository.findById(request.getId());
        post = repository.save(post);

        logger.info("successfully created a new Post");
        return post;

    }

    public Post updatePost(Long id, UpdatePostRequest request) {
        var post = repository.findById(id).get();
        post.setWeather(request.getWeather());
        post.setWaves(request.getWaves());
        post.setComments(request.getComments());
        post.setUpdatedAt(new Date());
        post = repository.save(post);
        logger.info("successfully updated Post");
        return post;

    }

    public void deletePost(long id) {
        try {
            repository.deleteById(id);
            logger.info("Successfullt deleted post by Id " + id);
        } catch (Exception exception) {
            logger.error(("Failed to delete post with Id"));

        }
    }

    public List<Post> getbyUserName(String userName) {
        return repository.findPostByUserUserName(userName);

    }

    public List<Post> getbyBeachName(String beachName) {
        return repository.findPostByBeachBeachName(beachName);
    }
}