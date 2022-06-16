package com.maveric.bank.controller;

import com.maveric.bank.model.User;
import com.maveric.bank.model.UserDTO;
import com.maveric.bank.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController
{
        @Autowired
        private UserServiceImpl uservice;

        @PostMapping("/users")
        public UserDTO createUser(@RequestBody User user){
                UserDTO userdto = uservice.createUser(user);
                return userdto;
        }
}
