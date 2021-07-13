package Frames;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFramesTest extends TestBase {
    public static void main(String[] args) {
        chromelaunch();
        openTestURL("https://www.w3schools.com/html/html_iframe.asp");
        singleFrame();

    }
    public static void singleFrame(){
        WebElement html = findByXpath("//*[@id=\"main\"]/div[3]/iframe");
        driver.switchTo().frame(html);
        WebElement css = findByXpath("//*[@id=\"topnav\"]/div/div/a[4]");
        css.click();

    }

}
