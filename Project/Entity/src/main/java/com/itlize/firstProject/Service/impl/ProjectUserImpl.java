package com.itlize.firstProject.Service.impl;

import com.itlize.firstProject.Entity.ProjectUser;
import com.itlize.firstProject.Repository.ProjectUserRepository;
import com.itlize.firstProject.Service.ProjectUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProjectUserImpl implements ProjectUserService {

    private final ProjectUserRepository repository;

    public ProjectUserImpl(ProjectUserRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProjectUser() {
        repository.saveAll(Stream.of(new ProjectUser(100L, 200L, 300L))
                .collect(Collectors.toList()));
    }

    public List<ProjectUser> getProjectUser() {
        return repository.findAll();
    }
}