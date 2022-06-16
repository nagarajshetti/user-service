package com.maveric.bank.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maveric.bank.model.User;
import com.maveric.bank.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest({UserController.class})
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private UserServiceImpl service;
    Date date = new Date();

    @Autowired
    MockMvc mockMvc;

        @Test
        void getControllerTest() throws Exception {
            User user = new User(1 ,"Nagaraj", "Ganapati", "Shetti", "nagaraj@gmail.com", "7204988434", "banglore", java.sql.Date.valueOf("1994-11-02"), this.date, this.date, "nag@678", "Accountant");
            given(service.createUser(user).getFirstName());
            mockMvc.perform(get("/api/users/test")).andExpect(status().is2xxSuccessful())
                    .andExpect(jsonPath("$.firstName", is("test")));
        }

}
