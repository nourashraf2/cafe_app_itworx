package com.example.cafe.repositories;

import com.example.cafe.model.Role;
import com.example.cafe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByRole(Role role);
    Optional<User> findByUsername(String userName);
}
