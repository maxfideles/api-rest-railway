package com.max.apirestrailway.domain.repository;

import com.max.apirestrailway.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
