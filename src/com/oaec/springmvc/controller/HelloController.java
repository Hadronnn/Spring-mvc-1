package com.oaec.springmvc.controller;

import com.oaec.springmvc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Person person){
        System.out.println("person = [" + person + "]");
        return "hello";
    }
}