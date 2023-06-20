package com.jinx.noWait.userSide.user.repository;

import com.jinx.noWait.userSide.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByMobile(String mobile);
}