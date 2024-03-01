package com.replica.zomato.dto;

import com.replica.zomato.enums.RestaurantCuisineEnum;

public class RestaurantDTO {

    private long id;
    private String restaurantName;
    private String description;
    private String cuisine;

    public RestaurantDTO(long id, String restaurantName, String description, String cuisine) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.description = description;
        this.cuisine = cuisine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
