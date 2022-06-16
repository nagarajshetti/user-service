package com.maveric.bank.service;
import com.maveric.bank.model.User;
import com.maveric.bank.model.UserDTO;
import com.maveric.bank.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.sql.Date;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
@RunWith(SpringRunner.class)
@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

        @Autowired
        private UserServiceImpl service;
        @MockBean
        private UserRepository repository;
        private User user;
    private java.util.Date date;

    @Test
        void createUserTest() {
            given(repository.save(any(User.class))).willReturn(new User(1 ,"Nagaraj", "Ganapati", "Shetti", "nagaraj@gmail.com", "7204988434", "banglore", Date.valueOf("1994-11-02"), this.date, this.date, "nag@678", "Accountant"));
            UserDTO userId = service.createUser(new User(1 ,"Nagaraj", "Ganapati", "Shetti", "nagaraj@gmail.com", "7204988434", "banglore", Date.valueOf("1994-11-02"), this.date, this.date, "nag@678", "Accountant"));
            Assertions.assertEquals(2, userId);
        }

}
