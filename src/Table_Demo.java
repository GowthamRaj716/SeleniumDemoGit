import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table_Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/table.html");

        WebElement element = driver.findElement(By.xpath("//table[@cellspacing='1']/tbody/tr[2]/td[1]"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.xpath("//table[@cellspacing='1']/tbody/tr"));
        for (WebElement row:elements) {
            System.out.println(row.getText());
        }
    }
}
