package com.example1.demo1.service.impl;

import com.example1.demo1.model.Tag;
import com.example1.demo1.repository.TagRepository;
import com.example1.demo1.service.TagService;
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
public class TagServiceImpl implements TagService {

    TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository){
        this.tagRepository = tagRepository;
    }

    @Override
    public void createTag(Tag tag) {
        tagRepository.save(tag);
    }

    @Override
    public Optional<Tag> getTag(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public Tag updateTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void deleteTag(Long id) {
        Optional<Tag> tag1 = tagRepository.findById(id);
        tag1.ifPresent(tagRepository :: delete);
    }
}
