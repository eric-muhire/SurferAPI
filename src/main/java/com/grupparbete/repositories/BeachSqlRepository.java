package com.grupparbete.repositories;

import com.grupparbete.entities.Beach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeachSqlRepository extends JpaRepository <Beach,Long> {

}
