package com.usermanagement.usermanagement.repository;

import com.usermanagement.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends  JpaRepository<User, Integer>{


    public User findByUsername(String username);
}