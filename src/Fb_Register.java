import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Register {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window(). maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rajesh");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ram");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("rajeshram@gmail.com");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("rajeshram@gmail.com");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("RajeshRam@123");

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select s = new Select(day);
        s.selectByIndex(14);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select s1 = new Select(month);
        s1.selectByIndex(8);

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select s2 = new Select(year);
        s2.selectByVisibleText("1995");

        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();





    }
}

