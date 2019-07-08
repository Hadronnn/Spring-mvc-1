package com.oaec.springmvc.controller;

import com.oaec.springmvc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class HelloController {
    /*@RequestMapping("/hello")
    public String hello(Person person){
        System.out.println("person = [" + person + "]");
        return "hello";
    }*/
    //使用map向request存储数据
    /*@RequestMapping("/hello")
    public String hello(String name, Map<String,Object> map){
        System.out.println("name = [" + name + "]");
        //将请求参数name，存储在request作用域
        map.put("name",name);
        return "hello";
    }*/
    //使用Model
    /*@RequestMapping("/hello")
    public String hello(String name, Model model){
        System.out.println("name = [" + name + "]");
        //将请求参数name，存储在request作用域
        model.addAttribute("name",name);
        return "hello";
    }*/
    //使用ModelAndView
    /*@RequestMapping("/hello")
    public ModelAndView hello(String name){
        System.out.println("name = [" + name + "]");
        //将请求参数name，存储在request作用域
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("name",name);
        return modelAndView;
    }*/
    //使用HTTPServletRequest
    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request){
        System.out.println("name = [" + name + "]");
        //将请求参数name，存储在request作用域
        request.setAttribute("name",name);
        return "hello";
    }
}