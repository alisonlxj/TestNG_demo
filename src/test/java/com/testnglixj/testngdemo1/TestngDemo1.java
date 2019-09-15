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
import org.testng.annotations.DataProvider;
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
        Assert.assertEquals(5, 5);
    }



    //This method will provide data to any test method that declares that its Data Provider
    //is named "test1"
    @DataProvider(name = "dataProvider1")
    public Object[][] data_createData1() {
        return new Object[][] {
                { "Cedric", new Integer(36) },
                { "Anne", new Integer(37)},
                { "alison", new Integer(27)},
                { "glodon", new Integer(20)},
        };
    }

    //This test method declares that its data should be supplied by the Data Provider
    //named "test1"

    /**
     * 根据二位数组返回的行数row行，自动生成 row 个这样的test用例；
     * 每一行插入 对应的参数（对应列值）
     * 因此若 dataProvider1 返回的二维数组有 n 行，则生成 n 个对应的用例
     * @param n1
     * @param n2
     */
    @Test(dataProvider = "dataProvider1")
    public void test_verifyData1(String n1, Integer n2) {
        System.out.println();
        System.out.println("-->enter here<----");
        System.out.println(n1 + " " + n2);
    }


}
