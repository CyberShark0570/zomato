package com.replica.zomato.services.user;

import com.replica.zomato.dto.RestaurantDTO;
import com.replica.zomato.entities.restaurant.Restaurant;
import com.replica.zomato.enums.RestaurantCuisineEnum;
import com.replica.zomato.occ.wsdto.RestaurantWsDTO;
import com.replica.zomato.repositories.RestaurantRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private ModelMapper modelMapper;

    public RestaurantWsDTO createRestaurant(RestaurantDTO restaurantDTO) {
        RestaurantWsDTO restaurantWsDTO = new RestaurantWsDTO();

        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantName(restaurantDTO.getRestaurantName());
        restaurant.setCuisine(RestaurantCuisineEnum.valueOf(restaurantDTO.getCuisine()));
        restaurant.setDescription(restaurantDTO.getDescription());
        restaurantRepository.save(restaurant);
        restaurantDTO.setId(restaurant.getId());
        modelMapper.map(restaurantDTO,restaurantWsDTO);


        return restaurantWsDTO;
    }

    public String requestCuisineCreation(String newCuisineName) {
        return "";
    }
}
