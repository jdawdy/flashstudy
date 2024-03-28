package com.example.demo.models;

import jakarta.persistence.*;

@Entity
//@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

//    @Size(min=4, max=25, message = "Username must be between 4 and 25 characters.")
//    @Column(name = "user_name", unique = true)
//    private String username;
//    @NotBlank
//    @Column(name = "email", unique = true)
//    private String email;
//    //    @Size(min =4, max=100, message = "Password must be between 4 and 100 characters.")
//    @NotBlank
//    @Column(name = "password")
//    private String password;

}
