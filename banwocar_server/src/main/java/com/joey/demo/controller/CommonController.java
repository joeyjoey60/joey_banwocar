package com.joey.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2019/6/27.
 */
@RestController
public class CommonController {


    @RequestMapping("/index")
    public  String index(){
        return  "index";
    }
}
