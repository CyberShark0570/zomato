package com.replica.zomato.dto.user.variants;

import com.replica.zomato.dto.user.ApplicationUserDTO;

public class RestaurantOwnerDTO extends ApplicationUserDTO {


    public RestaurantOwnerDTO(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, String userTypeEnum) {
        super(name, firstName, lastName, emailAddress, mobileNumber, password, userTypeEnum);
    }


}
