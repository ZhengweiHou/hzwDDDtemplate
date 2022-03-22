package com.houzw.ddd.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @ClassName HelloController
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/11
 **/
@RestController
@RequestMapping("hello")
public class HelloController {


    /**
     * @Description TODO
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping(value = "hello")
    public String hello(){
        return "Hello, welcome to hzwDDDtemplate";
    }

}
