package com.testnglixj.testngdemo1;

import com.testnglixj.testngdemo.TestngdemoApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@SpringBootTest(classes = TestngdemoApplication.class)
public class TestngDemo1 extends AbstractTestNGSpringContextTests {

    @Test
    public void test_01() {
        System.out.println("ssssssssssssssssssss");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test_02() {
        System.out.println("tttttttt");
        Assert.assertEquals(3, 9);
    }

}
