package com.joey.demo.controller;

import com.joey.demo.vo.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2019/6/27.
 */
@RestController
public class CommonController {

    @RequestMapping("/test")
    public UserInfo getUser(){
        return  new UserInfo("张三","123");
    }


}
