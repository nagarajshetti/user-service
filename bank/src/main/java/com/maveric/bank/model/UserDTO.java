package com.maveric.bank.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@RequiredArgsConstructor
public class UserDTO
{
        @NotNull(message = "Name cannot be null")
        @Size(min = 3, max = 10)
        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private Date dateOfBirth;
        private Date CreatedAt;
        private Date updatedAt;
        private String password;
        private String role;
}
