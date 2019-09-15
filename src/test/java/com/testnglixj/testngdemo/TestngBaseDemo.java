package com.testnglixj.testngdemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngBaseDemo {

    /**
     * 基类集成 可以实现 子类运行时 执行 @BeforeSuite 注解功能
     * 但是若指定group运行的 indclude 则 就只会运行 被include的那部分，包括这 @BeforeSuite 都不运行了
     */

    @BeforeSuite
    public void OnBeforeBaseSuite(){
        System.out.println("start >> enter -> OnBeforeBaseSuite");
    }

    @AfterSuite
    public void OnAfterBaseSuite(){
        System.out.println("end >> enter -> OnAfterBaseSuite");
    }

}
