package service.Impl;

import entity.Project;
import org.springframework.stereotype.Service;
import repository.ProjectRepository;
import service.ProjectService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
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
        repository.saveAll(Stream.of(new Project(LocalDate.of(2021,05,31), "Victor"))
                .collect(Collectors.toList()));
    }

    public List<Project> getProject() {
        return repository.findAll();
    }
}