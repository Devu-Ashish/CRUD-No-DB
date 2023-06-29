package com.interview.practice.crud.controllers;

import com.interview.practice.crud.models.User;
import com.interview.practice.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BaseController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String basic() {
        return "Hello All";
    }

    @GetMapping("/users")
    public Collection<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        return userService.createUser(user);
    };

    @PutMapping("/users")
    public ResponseEntity<Object> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    };

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Object> removeUser(@PathVariable int id) {
        return userService.deleteUser(id);
    };
}
