package com.replica.zomato.entities.address.variants;

import com.replica.zomato.entities.address.Address;
import com.replica.zomato.entities.user.variants.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity(name = "delivery_address")
public class CustomerDeliveryAddress extends Address {

    private boolean isDefault = false;
    private int sequence;
    private String nickName;
    @ManyToOne
    private Customer owner;

    public CustomerDeliveryAddress(long addressId, String addressLine1, String addressLine2, boolean isDefault, int sequence, String nickName, Customer owner) {
        super(addressId, addressLine1, addressLine2);
        this.isDefault = isDefault;
        this.sequence = sequence;
        this.nickName = nickName;
        this.owner = owner;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
