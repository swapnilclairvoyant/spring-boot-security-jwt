package com.example1.demo1.repository;

import com.example1.demo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/5/2020, Wed
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
