package com.jinx.noWait.userSide.user.controller;

import com.jinx.noWait.userSide.user.model.User;
import com.jinx.noWait.userSide.user.service.UserService;
import com.jinx.noWait.userSide.user.vo.LoginByMobileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

        @PostMapping("/user/auth/loginByMobile")
    public String loginByMobile(@RequestBody LoginByMobileVO loginByMobileVO){
        return userService.loginByMobile(loginByMobileVO);
    }

    @PostMapping("user/auth/registerByMobile")
        public String registerByMobile(@RequestBody User userVO){
        return userService.registerByMobile(userVO);
    }

}
