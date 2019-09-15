package com.testnglixj.testngdemo1;


import io.restassured.http.ContentType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


/**
 *  测试两个服务接口：
 *      localhost:8088
 *      localhost:8088/testdemo/getjson.do
 */
public class TestngMVC {

    @BeforeMethod
    public void methodBefore(){
        System.out.println("enter a new test");
    }

    @AfterMethod
    public void methodAfter(){
        System.out.println("over a test");
    }


    @Test
    public void test_mvc_index(){


        given().
        when().
                get("http://localhost:8088").
        then().
                contentType(ContentType.JSON).
                body("status", equalTo(200)).
                body("msg", equalTo("Welcome to TestNG and this is the index page"));
    }

    @Test
    public void test_mvc_getjson(){
        given().
        when().
                get("http://localhost:8088/testdemo/getjson.do").
        then().
                contentType(ContentType.JSON).
                body("msg", equalTo("返回f glodon 的结果")).
                body("status", equalTo(200)).
                body("demoUserList.size", is(1)).
                body("demoUserList[0].name", is("glodon"));
    }

}
