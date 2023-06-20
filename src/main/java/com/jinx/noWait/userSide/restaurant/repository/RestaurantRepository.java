package com.jinx.noWait.userSide.restaurant.repository;

import com.jinx.noWait.userSide.restaurant.model.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurants, String> {
    // Add any additional repository methods if needed
}