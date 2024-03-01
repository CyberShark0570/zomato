package com.replica.zomato.entities.user.variants;

import com.replica.zomato.entities.user.ApplicationUser;
import com.replica.zomato.enums.UserTypeEnum;
import jakarta.persistence.Entity;

@Entity(name = "delivery_agent")

public class DeliveryAgent extends ApplicationUser {

    private String agentCode;

    private double rating;

    //location
    //delivery_history
    //customer_ratings
    //delivery_count


    public DeliveryAgent(String name, String firstName, String lastName, String emailAddress, String mobileNumber, String password, UserTypeEnum userTypeEnum, String agentCode, double rating) {
        super(name, firstName, lastName, emailAddress, mobileNumber, password, userTypeEnum);
        this.agentCode = agentCode;
        this.rating = rating;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
