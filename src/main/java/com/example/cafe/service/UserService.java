package com.example.cafe.service;

import com.example.cafe.model.Role;
import com.example.cafe.model.User;
import com.example.cafe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllAdmins(){
        return userRepository.findByRole(Role.ADMIN);
    }

    public void saveAdmin(User admin){
        userRepository.save(admin);
    }
}
