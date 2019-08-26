package com.testngdemo.controller;


import com.testngdemo.pojo.MessageDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping("/")
    @ResponseBody
    public MessageDemo welcomeIndex(){
        MessageDemo messageDemo = new MessageDemo();
        messageDemo.setStatus(200);
        messageDemo.setMsg("Welcome to TestNG and this is the index page");
        return messageDemo;
    }

}
