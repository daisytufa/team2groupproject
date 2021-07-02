package com.itlize.firstProject.Service.impl;

import com.itlize.firstProject.Entity.Project;
import com.itlize.firstProject.Repository.ProjectRepository;
import com.itlize.firstProject.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProject() {
        repository.saveAll(Stream.of(new Project(100L, "project1", "User1"))
                .collect(Collectors.toList()));
    }

    public List<Project> getProject() {
        return repository.findAll();
    }
}


