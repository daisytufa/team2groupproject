package com.itlize.firstProject.Service.impl;


import com.itlize.firstProject.Entity.Resource;
import com.itlize.firstProject.Repository.ResourceRepository;
import com.itlize.firstProject.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ResourceImpl implements ResourceService {

    private final ResourceRepository repository;

    public ResourceImpl(ResourceRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initResource() {
        repository.saveAll(Stream.of(new Resource(100L, "Resource1", "001 010"))
                .collect(Collectors.toList()));
    }

    public List<Resource> getResource() {
        return repository.findAll();
    }
}