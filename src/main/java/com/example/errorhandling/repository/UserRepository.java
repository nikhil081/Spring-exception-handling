package com.example.errorhandling.repository;

import com.example.errorhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
    @Query("select u from User u where u.gender = ?1")
    List<User> findByGender(String gender);
}
