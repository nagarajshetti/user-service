package com.maveric.bank.service;

import com.maveric.bank.model.User;
import com.maveric.bank.model.UserDTO;

public interface UserService
{
    UserDTO createUser(User user);
}
