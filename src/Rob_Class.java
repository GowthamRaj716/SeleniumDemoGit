import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;



public class Rob_Class {
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Gowtham");
        Actions a = new Actions(driver);

        Robot r = new Robot();

        a.doubleClick(email).perform();
        a.contextClick(email).perform();

        for (int i = 1; i <=3 ; i++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_UP);
        }
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        WebElement pass = driver.findElement(By.id("pass"));
        a.click(pass).perform();

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

        driver.findElement(By.name("login")).click();







//        Thread.sleep(3000);
//        driver.close();
    }
}
