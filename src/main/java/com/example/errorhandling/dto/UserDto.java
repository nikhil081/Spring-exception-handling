package com.example.errorhandling.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDto {
    private int userId;
    private String name;
    private String gender;
    private String nationality;
}
