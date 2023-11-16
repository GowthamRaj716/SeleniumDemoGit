import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt_Class {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        Thread.sleep(3000);
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());

        a.sendKeys("gowtham");
        a.accept();





        ////span[@role='button']
    }

}
