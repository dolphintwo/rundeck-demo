package com.dolphintwo.rundeckdemo;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dd on 2018/8/20 16:14
 */
@RestController
public class HelloController {

    @RequestMapping
    public String sayHello(){
        return "Hello World!";
    }
}
