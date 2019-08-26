package com.testngdemo.pojo;

import java.util.Date;

public class DemoUser {

    private String name;
    private String email;
    private int age;
    private String address;
    private Date birthday;

    public DemoUser(String name, String email, int age, String address, Date birthday){
        this.address=address;
        this.age=age;
        this.birthday=birthday;
        this.email=email;
        this.name=name;
    }

    public DemoUser(){
        this("name",  "email@163.com", 20, "glodon at Beijing", new Date(2000,1,5));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
