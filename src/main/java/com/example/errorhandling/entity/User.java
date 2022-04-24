package com.example.errorhandling.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String gender;
    private String nationality;
}
