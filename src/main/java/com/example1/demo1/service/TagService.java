package com.example1.demo1.service;


import com.example1.demo1.model.Tag;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/10/2020, Mon
 **/
public interface TagService {

    void createTag(Tag tag);
    Optional<Tag> getTag(Long id);
    Tag updateTag(Tag tag);
    void deleteTag(Long id);

}
