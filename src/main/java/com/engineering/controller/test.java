package com.engineering.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class test {

    @GetMapping("test")
    @ResponseBody
    public  String test(){
        return  "test测试";
    }



}
