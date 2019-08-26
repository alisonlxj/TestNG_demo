package com.testngdemo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class MessageDemo {

    private String msg;
    private int status;         // 状态码，200, 300, 500

    private List<DemoUser> demoUserList;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DemoUser> getDemoUserList() {
        return demoUserList;
    }

    public void setDemoUserList(List<DemoUser> demoUserList) {
        this.demoUserList = demoUserList;
    }
}
