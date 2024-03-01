package com.replica.zomato.entities.user.variants;

import com.replica.zomato.entities.user.ApplicationUser;
import com.replica.zomato.enums.UserTypeEnum;

public class CustomerServiceAdmin extends ApplicationUser {

    public CustomerServiceAdmin(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, UserTypeEnum userTypeEnum) {
        super(name, firstName, lastName, emailAddress, mobileNumber, password, userTypeEnum);
    }
}
