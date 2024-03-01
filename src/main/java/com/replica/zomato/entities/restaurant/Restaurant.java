package com.replica.zomato.entities.restaurant;

import com.replica.zomato.entities.BaseEntity;
import com.replica.zomato.entities.user.variants.RestaurantOwner;
import com.replica.zomato.enums.RestaurantCuisineEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity(name = "restaurant")
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String restaurantName;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private RestaurantCuisineEnum cuisine;

    public Restaurant(long id, String restaurantName, String description, RestaurantCuisineEnum cuisine) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.description = description;
        this.cuisine = cuisine;
    }

    public Restaurant() {

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

    public RestaurantCuisineEnum getCuisine() {
        return cuisine;
    }

    public void setCuisine(RestaurantCuisineEnum cuisine) {
        this.cuisine = cuisine;
    }
}
