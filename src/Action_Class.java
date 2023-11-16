import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions a = new Actions(driver);

        WebElement drag=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));

        WebElement drop =driver.findElement(By.xpath("//div[text()='United States']"));

       a.clickAndHold(drag).moveToElement(drop).release().perform();


       driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");

       WebElement frame=driver.findElement(By.xpath("(//iframe[@width='700'])[1]"));

       driver.switchTo().frame(frame);

       WebElement drag1=driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));

       WebElement drop1=driver.findElement(By.id("trash"));

       a.dragAndDrop(drag1,drop1).perform();

    Thread.sleep(3_000);
    driver.close();

//
//        WebElement email = driver.findElement(By.id("email"));
//        Actions a = new Actions(driver);
//        a.moveToElement(email).perform();
//
//        WebElement pass = driver.findElement(By.id("pass"));
//        a.moveToElement(pass).perform();

    }
}
