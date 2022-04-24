package com.example.errorhandling.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDto {
    private int userId;
    @NotNull(message = "cant be null")
    private String name;
    private String gender;
    private String nationality;
}
