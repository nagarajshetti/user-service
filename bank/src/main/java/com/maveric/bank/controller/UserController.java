package com.maveric.bank.controller;

import com.maveric.bank.model.User;
import com.maveric.bank.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController
{
        private UserServiceImpl uservice;

        @PostMapping("/users")
        public User saveUser(@RequestBody User usr)
        {
            return uservice.saveUser(usr);
        }

        @GetMapping("/users")
        public List<User> findAllUsers()
        {
            return uservice.getAllUser();
        }

        @GetMapping("/Users/{id}")
        public User findById(@PathVariable int id)
        {
            return uservice.getUserById(id);
        }

        @PutMapping("/Users/{id}")
        public User updateStudent(@RequestBody User usr)
        {
            return uservice.saveUser(usr);
        }

        @DeleteMapping("/delete/{id}")
        public  String deleteStudet(@PathVariable int id)
        {
            return uservice.deleteUser(id);
        }
}
