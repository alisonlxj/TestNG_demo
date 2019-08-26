package com.testnglixj.testngdemo1;

import com.testngdemo.pojo.DemoUser;
import com.testnglixj.testngdemo.TestngdemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@SpringBootTest(classes = TestngdemoApplication.class)
public class TestngDemo1 extends AbstractTestNGSpringContextTests {

    @Autowired
    private DemoUser demoUser;

    @BeforeClass
    public void setup_class(){
        System.out.println("---> setup!");
        System.out.println("--> To get a demouser: " + demoUser);
    }

    @AfterClass
    public void teardown_class(){
        System.out.println("---> teardown for TestngDemo1.class!");
        System.out.println("test is over----");
    }


    @Test
    public void test_01() {
        System.out.println("enter -> test_01");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test_02() {
        System.out.println("enter -> test_02");
        Assert.assertEquals(3, 5);
    }



}
