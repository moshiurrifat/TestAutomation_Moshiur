package com.Screenshot;

import com.Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class PageScreenshot extends TestBase {
    private static Object ShootingStrategies;

    public static void main(String[] args) throws IOException {
        chromelaunch();
        openTestURL("https://www.bbc.com/");
        generatesSs();
        chromeClose();

    }
    public static void generatesSs() throws IOException {
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./src/test/Screenshots/pageImage.png"), true);

    }
    public static class generatesSs {

    }
    public static void genFullSs() throws IOException {
        Screenshot gfs = (new AShot()).shootingStrategy(ru.yandex.qatools.ashot.shooting.ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(gfs.getImage(), "png", new File("./src/test/Screenshot/gfs.png"));
    }



}
