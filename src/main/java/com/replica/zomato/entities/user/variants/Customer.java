package com.replica.zomato.entities.user.variants;

import com.replica.zomato.entities.user.ApplicationUser;
import com.replica.zomato.enums.UserTypeEnum;
import jakarta.persistence.*;

@Entity(name = "customer")
public class Customer extends ApplicationUser {

    public Customer(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, UserTypeEnum userTypeEnum) {
        super(name, firstName, lastName, emailAddress, mobileNumber, password, userTypeEnum);
    }

    //order_history

    //deliveryLocations

    //reviews

    //restaurant_favourites

    //food_favourites

    //payment_methods
}
