package com.tperuch.storeproject.config;

import com.tperuch.storeproject.entities.User;
import com.tperuch.storeproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "LeBron James", "theking@gmail.com", "98328652", "theking6");
        User u2 = new User(null, "Anthony Davis", "thebrow@gmail.com", "82174090", "ad3");

        repository.saveAll(Arrays.asList(u1,u2));
    }
}
