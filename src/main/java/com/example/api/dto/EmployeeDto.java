package com.example.api.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private Date birthDate;
    private long departmentId;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName, String mail, String password, Date birthDate, long departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.birthDate = birthDate;
        this.departmentId = departmentId;
    }

}
