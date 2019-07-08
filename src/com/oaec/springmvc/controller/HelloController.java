package com.oaec.springmvc.controller;

import com.oaec.springmvc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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

    @RequestMapping("/upload")
    public String upload(MultipartFile file) throws IOException {
        System.out.println("file = [" + file + "]");
        System.out.println(file.getOriginalFilename());//文件名
        System.out.println(file.getContentType());//文件类型
        System.out.println(file.getSize());//文件大小
        InputStream is = file.getInputStream();
        //将文件保存到桌面1文件夹下
        FileOutputStream os = new FileOutputStream("C:\\Users\\13646\\Desktop\\1\\" + file.getOriginalFilename());
        int len = -1;
        while ((len = is.read()) !=-1){
            os.write(len);
        }
        return "hello";
    }
}