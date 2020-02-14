package com.example1.demo1.service;

import com.example1.demo1.model.Paper;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/09/2020, Sun
 **/
public interface PaperService {

    void createPaper(Paper paper);
    Optional<Paper> getPaper(Long id);
    Paper updatePaper(Paper paper);
    void deletePaper(Long id);
}
