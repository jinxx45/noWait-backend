package com.jinx.noWait.userServices.restaurant.service;

import com.jinx.noWait.userServices.restaurant.model.Restaurants;
import com.jinx.noWait.userServices.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurants> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}