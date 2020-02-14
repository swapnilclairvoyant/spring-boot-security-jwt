package com.example1.demo1.controller;

import com.example1.demo1.model.Periodical;
import com.example1.demo1.service.PeriodicalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Api(value = "this api is to manage periodicals")
@RestController
@RequestMapping(value = PeriodicalResource.BASE_URL)
public class PeriodicalResource {
    static final String BASE_URL = "/api/v1/periodicals";

    PeriodicalService periodicalService;

    @Autowired
    public PeriodicalResource(PeriodicalService periodicalService){
        this.periodicalService = periodicalService;
    }

    @ApiOperation(value = "this api is to create periodicals")
    @PutMapping(value = "/createPeriodicals")
    public void createPeriodical(@RequestBody Periodical periodical){
        periodicalService.createPeriodical(periodical);
    }

    @ApiOperation(value = "this api is to create periodicals")
    @PutMapping(value = "/updatePeriodicals")
    public void updatePeriodical(@RequestBody Periodical periodical){
        periodicalService.createPeriodical(periodical);
    }

    @ApiOperation(value = "this api is to get periodicals by id")
    @GetMapping(value = "/getPeriodicals")
    public void getPeriodical(@RequestBody Long id){
        periodicalService.getPeriodical(id);
    }

    @ApiOperation(value = "this api is to delete periodicals by id")
    @DeleteMapping(value = "/deletePeriodicals")
    public void deletePeriodical(@RequestBody Long id){
        periodicalService.deletePeriodical(id);
    }
}
