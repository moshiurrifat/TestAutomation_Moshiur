package com.TestNG;

import com.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestAdvanced {
    WebDriver driver;
    String LoginURL="https://demo.opencart.com/index.php?route=account/login";


    @BeforeClass
    public void initSetup(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        Log.info("chrome launched");
        driver.get(LoginURL);
        Log.info("login page opened");

    }
    @AfterClass
    public void tearDown(){
        driver.close();
        Log.info("chrome closed");

    }
    @Test
    public void tc_1_Valid(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");
        Log.info("Type Email");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");
        Log.info("Type Password");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        Log.info("Click on Login Button");

        String Exp_Title="My Account";
        String Act_Title=driver.getTitle();

        Assert.assertEquals(Exp_Title,Act_Title);

        WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click();

        driver.findElement(By.linkText("Login")).click();

    }
    public void tc_1_InValid(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");
        Log.info("Type Email");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.sendKeys("123456232323");
        Log.info("Type Password");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        Log.info("Click on Login Button");

        String Exp_Title="Account Login";
        String Act_Title=driver.getTitle();

        Assert.assertEquals(Exp_Title,Act_Title);
    }
}
