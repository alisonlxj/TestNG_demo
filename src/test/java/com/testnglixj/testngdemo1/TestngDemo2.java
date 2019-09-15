package com.testnglixj.testngdemo1;

import com.testnglixj.testngdemo.TestngBaseDemo;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestngDemo2 extends TestngBaseDemo {

    @Test(groups = "demo2")
    public void test_01(){
        System.out.println("enter TestngDemo2#test01");
    }

    @Test(groups = "demo2")
    public void test_02(){
        System.out.println("enter TestngDemo2#test02");
    }

    @Test(groups = "demo3")
    public void test_03(){
        System.out.println("enter TestngDemo2#test03");
    }

    @Test(groups = "demo3", parameters = "arg")
    public void test_04(String arg){
        System.out.println("enter TestngDemo2#test04");
        System.out.println("arg param: " + arg + "\n");
    }

    @Test
    public void test_05(){
        System.out.println("enter TestngDemo2#test05");
        Class testdemo2 = TestngDemo2.class;
        System.out.println("[annotations]:");
        Annotation[] annotations = testdemo2.getDeclaredAnnotations();
        for (Annotation ano : annotations){
            System.out.println(ano.annotationType() + "--" + ano.toString());
        }

        System.out.println("[methods]:");
        Method[] methods = testdemo2.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName() + method.toString());
        }

    }

}
