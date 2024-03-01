package com.replica.zomato.occ.wsdto;

public class RestaurantWsDTO extends BaseWsDTO {

    private long id;
    private String restaurantName;
    private String description;
    private String cuisine;

    private boolean suggestUpdate;

    private boolean suggestBranchCreation;

    public RestaurantWsDTO(long id, String restaurantName, String description, String cuisine, boolean suggestUpdate, boolean suggestBranchCreation, String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
        this.id = id;
        this.restaurantName = restaurantName;
        this.description = description;
        this.cuisine = cuisine;
        this.suggestUpdate = suggestUpdate;
        this.suggestBranchCreation = suggestBranchCreation;
    }

    public RestaurantWsDTO() {
        super();
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

    public boolean isSuggestUpdate() {
        return suggestUpdate;
    }

    public void setSuggestUpdate(boolean suggestUpdate) {
        this.suggestUpdate = suggestUpdate;
    }

    public boolean isSuggestBranchCreation() {
        return suggestBranchCreation;
    }

    public void setSuggestBranchCreation(boolean suggestBranchCreation) {
        this.suggestBranchCreation = suggestBranchCreation;
    }
}
