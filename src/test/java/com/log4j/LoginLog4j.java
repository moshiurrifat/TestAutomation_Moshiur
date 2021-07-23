package com.log4j;

import com.Base.TestBase;
import com.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginLog4j extends TestBase {
    public static void main(String[] args) throws IOException {
        chromelaunch();
        TC_001_Valid();
        //TC_002_InValid();
        //chromeClose();
    }
    public static void TC_001_Valid() throws IOException {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Log.info("open login url");


        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");
        Log.info("type email");

        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");
        Log.info("type password");

        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        Log.info("click");
//yess no
        String Exp_Title="My account";
        String Act_Title= driver.getTitle();

        if (Exp_Title.equals(Act_Title)){
            System.out.println("passed valid data");
            Log.info("test passed");

            WebElement Logout= driver.findElement(By.linkText("Logout"));
            Logout.click();
            captureSs("logintest", ".png");
        }
        else{
            System.out.println("failed,bug found");

        }


        WebElement Logout= driver.findElement(By.linkText("Logout"));
        Logout.click();


    }



}
