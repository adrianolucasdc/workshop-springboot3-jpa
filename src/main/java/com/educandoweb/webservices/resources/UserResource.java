package com.educandoweb.webservices.resources;

import com.educandoweb.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        return ResponseEntity.ok(new User(1L, "Maria", "maria@mail", "9999", "12345"));
    }
}
