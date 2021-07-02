package com.itlize.firstProject.Service.impl;


import com.itlize.firstProject.Entity.Project_Resources;
import com.itlize.firstProject.Repository.Project_ResourcesRepository;
import com.itlize.firstProject.Service.ProjectResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProjectResourcesImpl implements ProjectResourceService {

    private final Project_ResourcesRepository repository;

    public ProjectResourcesImpl(Project_ResourcesRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProjectResource() {
        repository.saveAll(Stream.of(new Project_Resources(101L, 200L, 300L))
                .collect(Collectors.toList()));
    }

    public List<Project_Resources> getProjectResource() {
        return repository.findAll();
    }
}
