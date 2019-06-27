package com.joey.demo.vo;

import lombok.Data;

/**
 * Created by zhou on 2019/6/27.
 */
@Data
public class UserInfo {
    private String uname;
    private  String upwd;

    public UserInfo() {
    }

    public UserInfo(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }
}
