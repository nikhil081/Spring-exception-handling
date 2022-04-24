package com.example.errorhandling.controller;


import com.example.errorhandling.dto.UserDto;
import com.example.errorhandling.entity.User;
import com.example.errorhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser (@RequestBody UserDto userDto){
        return new ResponseEntity<>(service.saveUser(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchall")
    public ResponseEntity<List<User>> getAllUsers (){
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById (@PathVariable int id){
        return new ResponseEntity<>(service.getUserId(id), HttpStatus.OK);
    }


}
