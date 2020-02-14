package com.example1.demo1.service;

import com.example1.demo1.model.Periodical;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
public interface PeriodicalService {

    void createPeriodical(Periodical periodical);
    Optional<Periodical> getPeriodical(Long id);
    Periodical updatePeriodical(Periodical periodical);
    void deletePeriodical(Long id);

}
