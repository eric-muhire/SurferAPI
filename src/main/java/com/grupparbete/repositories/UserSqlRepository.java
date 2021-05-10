package com.grupparbete.repositories;

import com.grupparbete.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSqlRepository extends JpaRepository<User, Integer> {
}
