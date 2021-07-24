package com.TestNG;

import org.testng.annotations.Test;

public class TestNGBasic {
    @Test
    public void tc_1(){
        System.out.println("hello ");
    }

    @Test(enabled = false)
    public void tc_2(){
        System.out.println("hello world ");
    }
    @Test(description = "test description")
    public void tc_3(){
        System.out.println("bye");
    }

    @Test(priority = -1)
    public void tc_4(){
        System.out.println("goodbye world ");
    }
    @Test(groups = {"Login test"})
    public void tc_5(){
        System.out.println(" worldddd ");
    }

}
