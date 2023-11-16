import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        TakesScreenshot ts= (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\hp\\IdeaProjects\\untitled\\SnapFolder\\shot.png");
        FileUtils.copyFile(src,des);





    }

}
