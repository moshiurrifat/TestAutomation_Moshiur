package com.Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TestBase {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
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

    public static WebElement findByXpath(String Locator) {

        return driver.findElement(By.xpath(Locator));
    }

    public static void chromeClose(){
        driver.close();
        System.out.println("chrome closed");
        //driver.quit();
    }
    public static void openTestURL(String URL) {
        driver.get(URL);
    }
    public static void captureSs(String name,String format) throws IOException {
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./src/test/Screenshots/"+ name + format), true);

    }

}
