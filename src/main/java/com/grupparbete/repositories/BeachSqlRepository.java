package com.grupparbete.repositories;

import com.grupparbete.entities.Beach;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeachSqlRepository extends JpaRepository <Beach,Long> {
    List<Beach> findBeachByBeachName(String beachName);

}
