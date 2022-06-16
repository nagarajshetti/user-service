package com.maveric.bank.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.bank.model.User;
import com.maveric.bank.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Date;

@WebMvcTest({UserController.class})
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private UserServiceImpl service;
    Date date = new Date();
    User user;
    ObjectMapper mapper;

    UserControllerTest() {
        this.user = new User(1, "Nagaraj", "Ganapati", "Shetti", "nagaraj@gmail.com", "7204988434", "banglore", java.sql.Date.valueOf("1994-11-02"), this.date, this.date, "nag@678", "Accountant");
        this.mapper = new ObjectMapper();
    }

    @DisplayName("Test User for createUser")
    @Test
    void createUser() throws Exception {
        String jsonString = this.mapper.writeValueAsString(this.user);
        this.mvc.perform(MockMvcRequestBuilders.post("/api/users/", new Object[0]).contentType("application/json").accept(new String[]{"application/json"}).content(jsonString)).andExpect(MockMvcResultMatchers.status().isCreated());
    }

}