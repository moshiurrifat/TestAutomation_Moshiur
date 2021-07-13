package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Login extends TestBase {
    public static void main(String[] args) throws IOException {
        chromelaunch();
        TC_001_Valid();
        TC_002_InValid();
        //chromeClose();
    }
    public static void TC_001_Valid() throws IOException {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");

        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
//yess no
        String Exp_Title="My account";
        String Act_Title= driver.getTitle();

        if (Exp_Title.equals(Act_Title)){
            System.out.println("passed valid data");

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
    public static void TC_002_InValid(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail");

        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement LoginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();

        String Exp_Title="My account";
        String Act_Title= driver.getTitle();

        if (!Exp_Title.equals(Act_Title)){
            System.out.println("passed invalid data");


        }
        else{
            System.out.println("failed, invalid data .bug found");

        }

    }


}
