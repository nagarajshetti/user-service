package com.maveric.bank.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "address")
    private String adress;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    @Column(name = "createdAt")
    private Date dobcreatedAt;
    @Column(name = "updatedAt")
    private Date updatedAt;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;

    public User(int id, String firstName, String middleName, String lastName, String email,
                String phoneNumber, String adress, Date dob, Date dobcreatedAt, Date updatedAt,
                String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.dateOfBirth = dob;
        this.dobcreatedAt = dobcreatedAt;
        this.updatedAt = updatedAt;
        this.password = password;
        this.role = role;
    }
}
