import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;

public class Handling3 {
    public static void main(String[] args) throws AWTException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.snapdeal.com/");
        WebElement mensfasion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
        Actions a = new Actions(driver);
        a.moveToElement(mensfasion).perform();
        WebElement sports = driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"));
        a.click(sports).perform();

        driver.findElement(By.xpath("//img[@class='product-image '][1]")).click();

        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String all : windowHandles) {
            driver.switchTo().window(all);

//            if (all.equals(parentwindow)){
//                continue;
//            }
//            else{
//                driver.switchTo().window(all);
//            }
        }
        //Iterator<String> iterator = windowHandles.iterator();
        //String parent = iterator.next();
        //String child = iterator.next();
        //driver.switchTo().window(child);

        WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart']"));
        addtocart.click();


    }
}
