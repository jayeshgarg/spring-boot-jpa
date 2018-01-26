package com.gargjayesh.practice.jpa.service;

import com.gargjayesh.practice.jpa.entities.User;
import com.gargjayesh.practice.jpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    public List<User> getAll() {
        LOG.debug("This is a good example");
        return userRepository.findAll();
    }

    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public List<User> addNewUser(User newUser) {
        userRepository.save(newUser);
        return userRepository.findAll();
    }

}
