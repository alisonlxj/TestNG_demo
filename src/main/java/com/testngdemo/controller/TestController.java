package com.testngdemo.controller;


import com.testngdemo.pojo.DemoUser;
import com.testngdemo.pojo.MessageDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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


    @PostMapping("/createDemo.do")
    @ResponseBody
    public MessageDemo createDemoUser(@RequestParam("name") String name,
                                      @RequestParam("email") String email,
                                      @RequestParam(name = "address",required = false) String address,
                                      @RequestParam(name = "age", required = false) Integer age,
                                      @RequestParam(name = "birth", required = false) String birthStr){
        List<DemoUser> userList = new ArrayList<>();
        MessageDemo retMessage = new MessageDemo();
        retMessage.setMsg("");
        retMessage.setStatus(200);
        retMessage.setDemoUserList(userList);
        if(name ==null || email == null){
            retMessage.setStatus(300);
            retMessage.setMsg("参数错误");
        }
        if(address==null || address == ""){
            address = "locale at Beijing glodon default";
        }
        if(age==null){
            age = 20;
        }
        if(birthStr == null || birthStr == ""){
            birthStr = "1998/8/18 12:40:00";
        }
        Date birthday = new Date(birthStr);
        userList.add(new DemoUser(name,email, age, address, birthday));

        return retMessage;
    }


    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dd = new Date("1998/8/22 00:01:01");
        System.out.println(dd);
        System.out.println(dateFormat.format(dd));
    }

}
