package com.TestNG;

import org.testng.annotations.*;

public class AnnotationsOrder {

    @BeforeSuite
    public void setup(){
        System.out.println("setup done ");
    }
    @BeforeClass
    public void classSetup(){
        System.out.println("class setup done ");
    }
    @BeforeMethod
    public void methodSetup(){
        System.out.println("method setup done");
    }

    @Test
    public void tc_1(){
        System.out.println("hello ");
    }

    @Test
    public void tc_2(){
        System.out.println("hello world ");
    }
    @AfterMethod
    public void methodExecute(){
        System.out.println("after method execute");}

    @AfterClass
    public void classExecute(){
        System.out.println("after class execute");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test passed");
    }
    @AfterSuite
    public void afterSuitTest(){
        System.out.println("after suit test passed");}

}
