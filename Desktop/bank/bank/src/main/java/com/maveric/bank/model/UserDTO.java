package com.maveric.bank.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
public class UserDTO
{
        @NotNull(message = "Name cannot be null")
        @Size(min = 5, max = 20)
        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private Date dateOfBirth;
        private String gender;
        private String password;
        private String role;

        public UserDTO(int id, String firstName, String middleName, String lastName, String email, String phoneNumber, String address, Date dateOfBirth, String gender, Date createdAt, Date updatedAt, String role) {
        }

        public static UserDTO convertUserToUserDTO(User save) {
                        return new UserDTO(
                                save.getId(),
                                save.getFirstName(),
                                save.getMiddleName(),
                                save.getLastName(),
                                save.getEmail(),
                                save.getPhoneNumber(),
                                save.getAddress(),
                                save.getDateOfBirth(),
                                save.getGender(),
                                save.getCreatedAt(),
                                save.getUpdatedAt(),
                                save.getRole()
                        );
        }

    public int getId() {
            return getId();
    }
}
