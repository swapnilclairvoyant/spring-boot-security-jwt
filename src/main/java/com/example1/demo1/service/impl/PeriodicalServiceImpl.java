package com.example1.demo1.service.impl;

import com.example1.demo1.model.Periodical;
import com.example1.demo1.repository.PeriodicalRepository;
import com.example1.demo1.service.PeriodicalService;
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
public class PeriodicalServiceImpl implements PeriodicalService {
    PeriodicalRepository periodicalRepository;

    @Autowired
    public PeriodicalServiceImpl(PeriodicalRepository periodicalRepository){
        this.periodicalRepository = periodicalRepository;
    }

    @Override
    public void createPeriodical(Periodical periodical) {
        periodicalRepository.save(periodical);
    }

    @Override
    public Optional<Periodical> getPeriodical(Long id) {
        return periodicalRepository.findById(id);
    }

    @Override
    public Periodical updatePeriodical(Periodical periodical) {
        return periodicalRepository.save(periodical);
    }

    @Override
    public void deletePeriodical(Long id) {
        Optional<Periodical> periodical = periodicalRepository.findById(id);
        periodical.ifPresent(periodicalRepository :: delete);
    }
}
