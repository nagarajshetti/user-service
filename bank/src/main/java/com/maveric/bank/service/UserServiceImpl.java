package com.maveric.bank.service;

import com.maveric.bank.model.User;
import com.maveric.bank.repository.UserRepository;

import java.util.List;

public class UserServiceImpl
{
    private UserRepository st;

    public User saveUser(User eb)
    {
        return st.save(eb);
    }
    public List<User> getAllUser()
    {
        return st.findAll();
    }
    public User getUserById(int id)
    {
        return st.findById(id).orElse(null);
    }

    public String deleteUser(int id)
    {
        st.deleteById(id);
        return "User Removed"+id;
    }

    public User updateUser(User us)
    {
        User update=st.findById(us.getId()).orElse(null);
        update.setFirstName(us.getFirstName());
        update.setMiddleName(us.getMiddleName());
        update.setLastName(us.getLastName());
        update.setEmail(us.getEmail());
        update.setPhoneNumber(us.getPhoneNumber());
        update.setAdress(us.getAdress());
        update.setDateOfBirth(us.getDateOfBirth());
        update.setDobcreatedAt(us.getDobcreatedAt());
        update.setUpdatedAt(us.getUpdatedAt());
        update.setPassword(us.getPassword());
        update.setRole(us.getLastName());
        return st.save(update);
    }
}
