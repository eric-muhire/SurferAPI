package com.grupparbete.repositories;

import com.grupparbete.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostSqlRepository extends JpaRepository<Post,Long> {
  //List<Post>findByPostId(long id);

    List<Post>findPostByWeather(String weather);
    List<Post>findPostByWaves(String waves);
    List<Post> findPostByUserUserName(String userName);

//List<Post> findByBeachId(long beachId);
//List<Post>findbyBeach(String beachName);




}
