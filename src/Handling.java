import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Handling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/in/");
        WebElement window1= driver.findElement(By.xpath("(//a[@class='cta_button'])[1]"));
        window1.click();

     // String parentWindow = driver.getWindowHandle();//parent

      Set<String> allWindow = driver.getWindowHandles();//parent,child

        Iterator<String> itr=allWindow.iterator();

        String parent = itr.next();//parent

        String child = itr.next();//child

        driver.switchTo().window(child);

        driver.findElement(By.name("UserFirstName")).sendKeys("Ragavi");

        driver.switchTo().window(parent);

        driver.findElement(By.xpath("(//a[@class='cta_button'])[2]")).click();




    }
}
