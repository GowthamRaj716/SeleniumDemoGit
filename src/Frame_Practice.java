import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("lokesh");

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(frame1);

        WebElement frame2 = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
        driver.switchTo().frame(frame2);

        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Rahul");
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();

    }
}
