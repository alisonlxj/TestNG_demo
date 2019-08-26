package com.testngdemo.controller;


import com.testngdemo.pojo.DemoUser;
import com.testngdemo.pojo.MessageDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/testdemo")
public class TestController {

    @RequestMapping(value = "/getjson.do", method = RequestMethod.GET)
    @ResponseBody
    public MessageDemo getJsonMsg(){

        DemoUser demoUser = new DemoUser("glodon", "glodon@glo.com", 20, "zhognguancun_software_site", new Date(1997, 8, 8));
        List<DemoUser> demoUsers = new ArrayList<>();
        demoUsers.add(demoUser);
        MessageDemo messageDemo = new MessageDemo();
        messageDemo.setDemoUserList(demoUsers);
        messageDemo.setMsg("返回 glodon 的结果");
        messageDemo.setStatus(200);
        return messageDemo;
    }

}
