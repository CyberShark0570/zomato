package com.replica.zomato.occ.controllers.restaurant;

import com.replica.zomato.dto.RestaurantDTO;
import com.replica.zomato.occ.wsdto.RestaurantWsDTO;
import com.replica.zomato.services.user.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {


    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurant/create")
    public RestaurantWsDTO createRestaurant(@RequestBody final RestaurantDTO restaurantDTO) {
        return restaurantService.createRestaurant(restaurantDTO);
    }

//    @PostMapping("/restaurant/cuisine/create")
//    public String requestNewCuisineType(String newCuisineName) {
//        return restaurantService.requestCuisineCreation(newCuisineName);
//    }
}
