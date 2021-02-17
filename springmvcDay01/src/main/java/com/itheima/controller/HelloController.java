package com.itheima.controller;


import com.itheima.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//此处创建的controller实际上就是mvc模式中的c 也就是代替了web层的servlet的工作
@Controller //这里添加的注解 时需要让这个类成为一个控制器 放到核心容器中  让他能够接收请求
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/sayHello")  //添加请求路径的映射
    public String sayHello(){
      //这里处理请求 代替servlet
        //跳转到登陆成功页面
        System.out.println("HelloController接收到了一个请求 ");


        //跳转到登陆成功页面 （/WEB-INF/pages/success.jsp）
        //需要返回值跳转"success" 由这个返回值直接想跳转到路径 ：/WEB-INF/pages/success.jsp
        //需要一个中间人帮我们通过"success" 能直接跳转到指定页面 这个中间人就是视图解析器（在springmvc.xml中配置）
        return "success";
    }
    @RequestMapping("/getName")
    public String getName(){

        User user = new User();

        System.out.println("HelloController的getName方法执行了！");
        return "success";
    }



}
