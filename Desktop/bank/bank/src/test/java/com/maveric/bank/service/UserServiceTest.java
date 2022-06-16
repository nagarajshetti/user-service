package com.maveric.bank.service;
import com.maveric.bank.model.User;
import com.maveric.bank.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


        @Autowired
        private UserServiceImpl service;
        @MockBean
        private UserRepository repository;
        private User user;

        @Test
        @DisplayName("Test Create User")
        public void testCreateUser() {
            Date date = new Date();
            User user = new User(1, "Nagaraj", "Ganapati", "Shetti", "nagaraj@gmail.com", "7204988434", "banglore", java.sql.Date.valueOf("1998-02-24"), date, date, "nag123", "Customer");
            Mockito.when(this.repository.save(user)).thenReturn(user);
            Assertions.assertEquals(user.getId(), this.service.createUser(user).getId());
        }

        @Test
        @DisplayName("Testing Save User")
        public void testSaveUser() {
            User result = (User) this.repository.save(this.user);
            Assertions.assertNotNull(result);
            Assertions.assertEquals(1, result.getFirstName());
            Assertions.assertEquals(1, result.getLastName());

        }
}
