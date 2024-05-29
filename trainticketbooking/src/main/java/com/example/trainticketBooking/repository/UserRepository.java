package com.example.trainticketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.trainticketBooking.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
