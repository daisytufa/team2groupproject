package service.Impl;

import entity.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initUser() {
        repository.saveAll(Stream.of(new User("VIC","titleA", "roleA", LocalDate.of(2021,07,01), LocalDate.of(2021,07,02), "12345678"))
                .collect(Collectors.toList()));
    }

    public List<User> getPUser() {
        return repository.findAll();
    }
}
