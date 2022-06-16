package com.maveric.bank.service;

import com.maveric.bank.model.User;
import com.maveric.bank.model.UserDTO;
import com.maveric.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userrepo;

    @Override
    public UserDTO createUser(User user) {
        return UserDTO.convertUserToUserDTO(userrepo.save(user));
    }
}