package com.replica.zomato.entity.user;

import com.replica.zomato.enums.UserTypeEnum;

public class RestaurantOwner extends ApplicationUser{

    public RestaurantOwner(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, UserTypeEnum userTypeEnum) {
        super(name, firstName, lastName, emailAddress, mobileNumber, password, userTypeEnum);
    }
}
