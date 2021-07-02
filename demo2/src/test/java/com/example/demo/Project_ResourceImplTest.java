package com.example.demo;

import entity.Project_Resources;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repository.Project_ResourcesRepository;


import java.time.LocalDate;



@RunWith(SpringRunner.class)
@SpringBootTest

public class Project_ResourceImplTest {

    Project_ResourcesRepository project_resourcesRepository;

    @BeforeClass
    @Test
    public void saveTest() {
        Project_Resources pr = new Project_Resources();
        pr.setRecord_id(005);
        pr.setTime_created(LocalDate.of(2021, 06, 28));
        pr.setProject_id(8);
        pr.setResource_id(007);

        Project_Resources res = project_resourcesRepository.save(pr);
        Assert.assertNotEquals(null, res);
    }
}

