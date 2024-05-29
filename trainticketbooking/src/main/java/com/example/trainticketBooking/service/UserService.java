package com.example.trainticketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trainticketBooking.model.User;
import com.example.trainticketBooking.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
