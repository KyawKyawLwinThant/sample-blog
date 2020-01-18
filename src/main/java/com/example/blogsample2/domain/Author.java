package com.example.blogsample2.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Name cannot be empty.")
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past
    private LocalDate dataOfBirth;
    @Email(message = "Invalid Email Format")
    @NotEmpty(message = "Email cannot be empty!")
    private String email;
    @Embedded
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
