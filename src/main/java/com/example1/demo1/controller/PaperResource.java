package com.example1.demo1.controller;

import com.example1.demo1.model.Paper;
import com.example1.demo1.service.PaperService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Api(value = "this api is to manage papers")
@RestController
@RequestMapping()
public class PaperResource {

    static final String BASE_URL = "/api/v1/papers";
    private PaperService paperService;

    @Autowired
    public PaperResource(PaperService paperService){
        this.paperService = paperService;
    }

    @ApiOperation(value =  "this api is to create a new Paper")
    @PutMapping(value = "/createPaper")
    public void createPaper(@RequestBody Paper paper){
        paperService.createPaper(paper);
    }

    @ApiOperation(value =  "this api is to update a existing Paper")
    @PutMapping(value = "/updatePaper")
    public void updatePaper(@RequestBody Paper paper){
        paperService.updatePaper(paper);
    }

    @ApiOperation(value =  "this api is to update a existing Paper")
    @GetMapping(value = "/createPaper")
    public Optional<Paper> getPaper(@RequestParam Long id){
       return paperService.getPaper(id);
    }
}
