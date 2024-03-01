package com.replica.zomato.dto.user;

import com.replica.zomato.enums.UserTypeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ApplicationUserDTO {
    private String name;
    private String firstName;
    private String lastName;

    private String emailAddress;
    private String mobileNumber;
    private String password;
    private String userTypeEnum;

    public ApplicationUserDTO(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, String userTypeEnum) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.userTypeEnum = userTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserTypeEnum() {
        return userTypeEnum;
    }

    public void setUserTypeEnum(String userTypeEnum) {
        this.userTypeEnum = userTypeEnum;
    }
}
