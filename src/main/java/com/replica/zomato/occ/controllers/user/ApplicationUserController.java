package com.replica.zomato.occ.controllers.user;

import com.replica.zomato.dto.user.ApplicationUserDTO;
import com.replica.zomato.dto.user.variants.RestaurantOwnerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user-onboarding")
public class ApplicationUserController {

    @PostMapping("/restaurant-owner/create")
    public void createRestaurantOwner(@RequestBody RestaurantOwnerDTO userDTO){

    }






}
