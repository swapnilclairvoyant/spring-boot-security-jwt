package com.example1.demo1.service.impl;

import com.example1.demo1.model.Paper;
import com.example1.demo1.repository.PaperRepository;
import com.example1.demo1.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Service
@Transactional
public class PaperServiceImpl implements PaperService {
    PaperRepository paperRepository;

    @Autowired
    public PaperServiceImpl(PaperRepository paperRepository){
        this.paperRepository = paperRepository;
    }


    @Override
    public void createPaper(Paper paper) {
        paperRepository.save(paper);
    }

    @Override
    public Optional<Paper> getPaper(Long id) {
        return paperRepository.findById(id);
    }

    @Override
    public Paper updatePaper(Paper paper) {
        return paperRepository.save(paper);
    }

    @Override
    public void deletePaper(Long id) {
        Optional<Paper> paper = paperRepository.findById(id);
        paper.ifPresent(paperRepository :: delete);
    }
}
