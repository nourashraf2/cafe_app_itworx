package com.example.cafe.controller;


import com.example.cafe.model.User;
import com.example.cafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/getAdmins")
    public List<User> getAdmins(){
       return userService.getAllAdmins();
    }

    @PostMapping("/addAdmin")
    public void addAdmin(@RequestBody User admin){
        userService.saveAdmin(admin);
    }





}
