package com.TestNG;

import com.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegTestNGAdvanced {
    WebDriver driver;
    String LoginURL = "https://demo.opencart.com/index.php?route=account/register";

    @BeforeClass
    public void initSetup() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Log.info("chrome launched");
        driver.get(LoginURL);
        Log.info("reg page opened");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        Log.info("chrome closed");
    }
    @Test
    public void regtestNG(){
        WebElement fName = driver.findElement(By.id("input-firstname"));
        fName.sendKeys("rhgb");

        WebElement lName = driver.findElement(By.id("input-lastname"));
        lName.sendKeys("rhtyh");

        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("moshiurhrhr@gmail.com");

        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("1234556569");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement Passwordconfirm= driver.findElement(By.id("input-confirm"));
        Passwordconfirm.sendKeys("123456");

        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();
        Log.info("Registration Successful");

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();
        Log.info("Logout Successful");


        //driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement EmailAdress = driver.findElement(By.id("input-email"));
        EmailAdress.sendKeys((CharSequence) Email);
        WebElement EnterPassword = driver.findElement(By.id("input-password"));
        EnterPassword.sendKeys("123456");
        WebElement log = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]"));
        log.click();
        Log.info("Login Successful");

    }
}

