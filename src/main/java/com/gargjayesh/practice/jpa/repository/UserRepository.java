package com.gargjayesh.practice.jpa.repository;

import com.gargjayesh.practice.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
