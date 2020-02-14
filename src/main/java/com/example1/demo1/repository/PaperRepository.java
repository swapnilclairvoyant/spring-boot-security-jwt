package com.example1.demo1.repository;

import com.example1.demo1.model.Paper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
public interface PaperRepository extends JpaRepository<Paper, Long> {
}
