package com.jinx.noWait.userSide.restaurant.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jinx.noWait.userSide.restaurant.model.Restaurants;

import com.jinx.noWait.userSide.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user/api")
public class RestaurantController {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
    private final RestaurantService restaurantService;


    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/getAllRestaurants")
    public ResponseEntity<List<Restaurants>> getAllRestaurants() {
        logger.debug("API CALL : /user/api/restaurants");
        List<Restaurants> restaurants = restaurantService.getAllRestaurants();
        logger.debug("Data retrieved from RestaurantController getAllRestaurants() :"+restaurants.toString());
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }
}