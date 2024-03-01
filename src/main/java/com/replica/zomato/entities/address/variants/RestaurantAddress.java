package com.replica.zomato.entities.address.variants;

import com.replica.zomato.entities.address.Address;
import com.replica.zomato.entities.user.variants.RestaurantOwner;
import jakarta.persistence.ManyToOne;

public class RestaurantAddress extends Address {

    //restaurant model

    @ManyToOne
    private RestaurantOwner owner;

    public RestaurantAddress(long addressId, String addressLine1, String addressLine2, RestaurantOwner owner) {
        super(addressId, addressLine1, addressLine2);
        this.owner = owner;
    }

    public RestaurantOwner getOwner() {
        return owner;
    }

    public void setOwner(RestaurantOwner owner) {
        this.owner = owner;
    }
}
