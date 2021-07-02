package service.Impl;

import entity.Project_Resources;
import org.springframework.stereotype.Service;
import repository.Project_ResourcesRepository;
import service.Project_ResourceService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class Project_ResourceServiceImpl implements Project_ResourceService {
    private final Project_ResourcesRepository repository;

    public Project_ResourceServiceImpl(Project_ResourcesRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProjectResource() {
        repository.saveAll(Stream.of(new Project_Resources(00100, LocalDate.of(2021,06,30), 1, 101))
                .collect(Collectors.toList()));
    }

    public List<Project_Resources> getProjectResource() {
        return repository.findAll();
    }
}