package service.Impl;

import entity.Project_columns;
import org.springframework.stereotype.Service;
import repository.Project_columnsRepository;
import service.Project_columnsService;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Project_columnsServiceImpl implements Project_columnsService {
    private final Project_columnsRepository repository;

    public Project_columnsServiceImpl(Project_columnsRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initProject_columns() {
        repository.saveAll(Stream.of(new Project_columns(00100, "columnA", "formulaB"))
                .collect(Collectors.toList()));
    }

    public List<Project_columns> getProject_columns() {
        return repository.findAll();
    }
}
