package com.example1.demo1.controller;

import com.example1.demo1.model.Tag;
import com.example1.demo1.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
@Api(value= "this api is to manage tags")
@RestController
@RequestMapping(value = TagResource.BASE_URL)
public class TagResource {
    static final String BASE_URL = "/api/v1/tags";

    TagService tagService;

    @Autowired
    public TagResource(TagService tagService){
        this.tagService = tagService;
    }

    @ApiOperation(value = "this api is to get tag by id")
    @GetMapping(value = "/getTag")
    public Optional<Tag> getTag(@RequestParam Long id){
        return  tagService.getTag(id);
    }

    @ApiOperation(value = "this api is to create tag")
    @PutMapping(value = "/createTag")
    public void createTag(@RequestBody Tag tag){
        tagService.createTag(tag);
    }

    @ApiOperation(value = "this api is to update existing tag")
    @PutMapping(value = "/updateTag")
    public Tag updateTag(@RequestBody Tag tag){
       return tagService.updateTag(tag);
    }

    @ApiOperation(value = "this api is to delete existing tag")
    @DeleteMapping(value = "/deleteTag")
    public void updateTag(@RequestParam Long id){
        tagService.deleteTag(id);
    }
}
