package com.kovshov.Rest.Shop.service;

import com.kovshov.Rest.Shop.model.User;
import com.kovshov.Rest.Shop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
