package com.jinx.noWait.userSide.user.vo;

public class LoginByMobileVO {
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobileNumber) {
        this.mobile = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String mobile;
    private String password;

    public LoginByMobileVO(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }
}
