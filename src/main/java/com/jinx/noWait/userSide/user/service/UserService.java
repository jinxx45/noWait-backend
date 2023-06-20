package com.jinx.noWait.userSide.user.service;

import com.jinx.noWait.userSide.user.model.User;
import com.jinx.noWait.userSide.user.repository.UserRepository;
import com.jinx.noWait.userSide.user.vo.LoginByMobileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService    {
    private final UserRepository userRepository;
    private final PasswordEncoderUtil passwordEncoderUtil;
    @Autowired
    public UserService (UserRepository userRepository, PasswordEncoderUtil passwordEncoderUtil){
        this.userRepository = userRepository;
        this.passwordEncoderUtil = passwordEncoderUtil;
    }
    public String loginByMobile(LoginByMobileVO loginByMobileVO) {
        User user = userRepository.findByMobile(loginByMobileVO.getMobile());

        //No Mobile Number exists
        if(user == null){
            return "EXP- MOBILE NUMBER DOES NOT EXISTS";
        }
        else if(passwordEncoderUtil.matches(loginByMobileVO.getPassword(),user.getPassword())){
            return "LOGIN SUCCESSFUL";
        }
        else{
            return "PLEASE CHECK THE PASSWORD";
        }

    }

    public String registerByMobile(User userVO) {
        User user = userRepository.findByMobile(userVO.getMobile());

        if(user != null){
            return "MOBILE NUMBER ALREADY EXISTS, TRY LOGGING IN";
        }
        else{
            String encryptedPassword = passwordEncoderUtil.encodePassword(userVO.getPassword());
            userVO.setPassword(encryptedPassword);
            return String.valueOf(userRepository.save(userVO));
        }
    }
}
