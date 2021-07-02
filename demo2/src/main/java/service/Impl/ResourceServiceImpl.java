package service.Impl;

import entity.Resources;
import org.springframework.stereotype.Service;
import repository.ResourcesRepository;
import service.ResourceService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ResourceServiceImpl implements ResourceService {

    private final ResourcesRepository repository;

    public ResourceServiceImpl(ResourcesRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initResource() {
        repository.saveAll(Stream.of(new Resources(005, LocalDate.of(2021,07,01), LocalDate.of(2021,07,02)))
                .collect(Collectors.toList()));
    }

    public List<Resources> getResource() {
        return repository.findAll();
    }
}

