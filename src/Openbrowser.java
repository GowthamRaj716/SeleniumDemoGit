import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
     public static void main(String[] args) throws InterruptedException {
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/");

          driver.findElement(By.id("email")).sendKeys("gowtham@gmail.com");
          driver.findElement(By.id("pass")).sendKeys("dfgdfgdr");
          driver.findElement(By.name("login")).click();

          


     }


}