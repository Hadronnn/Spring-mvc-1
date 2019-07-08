package com.oaec.springmvc.controller;

import com.oaec.springmvc.entity.Person;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

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
    public String upload(HttpServletRequest request,MultipartFile file) throws IOException {
        System.out.println("file = [" + file + "]");
        System.out.println(file.getOriginalFilename());//文件名
        System.out.println(file.getContentType());//文件类型
        System.out.println(file.getSize());//文件大小
        String filename = file.getOriginalFilename();
        InputStream is = file.getInputStream();
        //UUID
        UUID uuid = UUID.randomUUID();
        //在项目根目录下的upload文件夹
        String realPath = request.getServletContext().getRealPath("/upload");
        //将文件保存到D盘upload文件夹下
        File saveFile = new File(realPath + File.separator +uuid+ filename.substring(filename.lastIndexOf(".")));
        if (!saveFile.getParentFile().exists()){
            saveFile.getParentFile().mkdirs();
        }
        FileOutputStream os = new FileOutputStream(saveFile);
        IOUtils.copy(is,os);
        /*int len = -1;
        while ((len = is.read()) !=-1){
            os.write(len);
        }*/
        is.close();
        os.close();
        return "hello";
    }
}