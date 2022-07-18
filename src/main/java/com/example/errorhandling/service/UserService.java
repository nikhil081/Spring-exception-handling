package com.example.errorhandling.service;

import com.example.errorhandling.dto.UserDto;
import com.example.errorhandling.entity.User;
import com.example.errorhandling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto){
        User user = User.build(0, userDto.getName(),userDto.getGender(),userDto.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserId(int id){
        return userRepository.findByUserId(id);
    }

    public Optional<List<User>> getUsersGender(String gender){
        return userRepository.findByGender(gender);
    }

}
