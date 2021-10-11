package com.tperuch.storeproject.resource;

import com.tperuch.storeproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"Danny", "Danny@gmail","588621004", "green");
        return ResponseEntity.ok().body(user);
    }
}