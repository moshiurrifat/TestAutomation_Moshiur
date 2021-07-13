package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registration extends TestBase {
    public static void main(String[] args) {
        chromelaunch();
        Reg_001_Valid();
        inputFieldValidationTest();

       // chromeClose();

    }
    public static void Reg_001_Valid() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName = driver.findElement(By.id("input-firstname"));
        fName.sendKeys("Rifat");

        WebElement lName = driver.findElement(By.id("input-lastname"));
        lName.sendKeys("Rahman");

        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("moshiur951695@gmail.com");

        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement Passwordconfirm= driver.findElement(By.id("input-confirm"));
        Passwordconfirm.sendKeys("123456");

        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();
    }
    public static void inputFieldValidationTest(){
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        WebElement fName = driver.findElement(By.id("input-firstname"));
        fName.sendKeys("alijbfgaibvaoebrvaugjhdfgvjhdsgedfrbvsdfbvldjafbvjlhdabfvjdfbvjhfdbjadsoh");
        Reg_Btn.click();
        String Exp_message="";
        String Act_message=driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div")).getText();
        if (Exp_message.equals(Act_message)){
            System.out.println("fname validation passed");
        }
        else {
            System.out.println("fname validation failed");

        }
    }
    public boolean fName(){
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        WebElement fName = driver.findElement(By.id("input-firstname"));
        fName.sendKeys("alijbfgaibvaoebrvaugjhdfgvjhdsgedfrbvsdfbvldjafbvjlhdabfvjdfbvjhfdbjadsoh");
        Reg_Btn.click();
        String Exp_message="";
        String Act_message=driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div")).getText();
        if (Exp_message.equals(Act_message)){
            System.out.println("fname validation passed");
        }
        return true;

    }


}
