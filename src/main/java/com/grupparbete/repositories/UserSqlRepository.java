package com.grupparbete.repositories;

import com.grupparbete.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSqlRepository extends JpaRepository<User, Long> {
   // List<User>getById(Long id);

}
