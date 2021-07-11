package com.config;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {

    public static WebDriver driver;

    public static void main(String[] args) {
        chromelaunch();
        chromeClose();
    }

    public static void chromelaunch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        System.out.println("chrome launched");

    }

    public static void chromeClose(){
        driver.close();
        System.out.println("chrome closed");
        //driver.quit();
    }
}
