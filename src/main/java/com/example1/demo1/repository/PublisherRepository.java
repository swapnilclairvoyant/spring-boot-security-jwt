package com.example1.demo1.repository;

import com.example1.demo1.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
