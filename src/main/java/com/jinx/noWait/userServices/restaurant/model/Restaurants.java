package com.jinx.noWait.userServices.restaurant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Restaurants {
    @Id
    private String restaurantId;
    private String restaurantName;
    private String restaurantType;
    private String restaurantAddress;
    private String restaurantPincode;
    private String contactNumber;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPincode() {
        return restaurantPincode;
    }

    public void setRestaurantPincode(String restaurantPincode) {
        this.restaurantPincode = restaurantPincode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Restaurants{" +
                "restaurantId='" + restaurantId + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantType='" + restaurantType + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantPincode='" + restaurantPincode + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}