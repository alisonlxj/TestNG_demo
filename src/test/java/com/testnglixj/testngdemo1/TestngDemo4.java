package com.testnglixj.testngdemo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDemo4 {

    @Test
    public void test_01demo4(){
        System.out.println("-->test_01");
        Assert.assertEquals("abc", "abc");
    }

    @Test
    public void test_02demo4(){
        System.out.println("-->test_02");
        Assert.assertEquals("abc", "abcd");
    }
}
