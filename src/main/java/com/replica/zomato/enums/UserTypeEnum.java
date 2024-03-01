package com.replica.zomato.enums;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

public enum UserTypeEnum {


    RESTAURANT_OWNER,
    DELIVERY_AGENT,
    CUSTOMER,
    CUSTOMER_SERVICE_AGENT,
    CUSTOMER_ADMIN
}
