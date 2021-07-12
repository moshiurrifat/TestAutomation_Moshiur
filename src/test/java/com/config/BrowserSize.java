package com.config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize extends BrowserConfig{

    public static void main(String[] args) {

        chromeLaunch();
        Screen_PC();
        getScreenSize();
        chromeClose();


    }
    public static void chromeLaunch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

    }
    public static void getScreenSize(){
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("screen width: "+width+"screen heigth: "+height);

    }

    public static void Screen_PC(){
        driver.manage().window().setSize(new Dimension(769,400));

    }
    public static void Screen_Tab(){
        driver.manage().window().setSize(new Dimension(768,400));

    }

}
