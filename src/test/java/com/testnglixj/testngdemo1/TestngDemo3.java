package com.testnglixj.testngdemo1;

import org.testng.annotations.*;

public class TestngDemo3 {

    @BeforeGroups(groups = "grpTest")
    public void beforeGrp(){
        System.out.println("before group <grpTest>");
    }
    @AfterGroups(groups = "grpTest")
    public void afterGrp(){
        System.out.println("after group <grpTest>");
    }
    @BeforeMethod()
    public void beforeMtd(){
        System.out.println("before -> every method");
    }
    @AfterMethod()
    public void afterMtd(){
        System.out.println("after -> every method");
    }

    @Test
    public void test_01abc(){

        System.out.println("test_01abc");
    }
    @Test(groups = "grpTest")
    public void test_02def(){
        System.out.println("test_02def");
    }
    @Test(groups = "grpOther")
    public void test_03xyz(){
        System.out.println("test_03xyz");
    }

}
