package com.engineering.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//修饰范围 类 (加入命名空间) 方法(指定具体路径)
@RequestMapping("test")
public class test {

    @GetMapping("test")
    //让返回效果在页面上显示
    @ResponseBody
    public  String test(){
         return  "test测试";
    }



}
