package com.itheima.controller;


import com.itheima.pojo.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")//配置两层映射路径
@SessionAttributes("user")
public class UserController {

    //参数以简单值接收
    @RequestMapping(value = "/getName",method = {RequestMethod.GET,RequestMethod.POST})
    public String getName(String username,String address){
        //这个方法 目的： 接收客户端发送的请求参数 接收username
        //接收简单类型的参数 要求：方法的参数名 和 请求参数的name 一致
        System.out.println("userController的getName方法执行了！username="+username+",address="+address);
        return "success";
    }
    //参数以map接收
    @RequestMapping("/getParameterMap")
    public String getParameterMap(@RequestParam Map<String,Object> params ){
        System.out.println("接收到的所有请求参数：" + params);
        return "success";
     }

     //参数以bean接收
    @RequestMapping("/getParameterBean")
    public String getParameterBean(User user){
        //接收到的参数封装到user对象里
        System.out.println("接收到的所有请求参数：" + user);

        return "success";
    }

    //以list形式接收
    //list类型接收参数
    @RequestMapping("/getParameterList")
    public String geParameterList(@RequestParam List<String> hobby){
        System.out.println("接收到的所有请求参数：" + hobby);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String findByName(@PathVariable("id") int id){
        System.out.println("接收到的所有请求路径是：" + id);
        return "success";
    }
    @RequestMapping("/login")
    public String login(User user, Model model){
        //登录时将user信息展示到登录成功页面info的页面上
        model.addAttribute("user",user);
        return "info";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "User-Agent") String requestHeader){
        System.out.println("requestHeder="+requestHeader);
        return "success";
    }


}
