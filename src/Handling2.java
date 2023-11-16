import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Handling2 {
    public static void main(String[] args) throws AWTException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        Actions a=new Actions(driver);
        WebElement gmail= driver.findElement(By.xpath("//a[text()='Gmail']"));
        a.contextClick(gmail).perform();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        String parent =driver.getWindowHandle();
        System.out.println(parent);

       Set<String> all = driver.getWindowHandles();

        for (String str:all) {

           if (str.equals(parent))
               continue;
           else
               driver.switchTo().window(str);
        }



    }
}
