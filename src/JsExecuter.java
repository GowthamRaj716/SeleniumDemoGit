import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
         driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("RolexWatch");

        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

//Thread.sleep(3000);
     WebElement pgdown = driver.findElement(By.xpath("//span[text()='Harry Niemann']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].scrollIntoView()",pgdown);

    }
}
