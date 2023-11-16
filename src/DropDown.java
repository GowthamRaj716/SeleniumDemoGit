import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://letcode.in/dropdowns");
        WebElement dropdown=driver.findElement(By.id("fruits"));
        Select s=new Select(dropdown);
        s.selectByVisibleText("Orange");
        WebElement multidown=driver.findElement(By.id("superheros"));
        Select s1 = new Select(multidown);
        s1.selectByValue("bt");
        s1.selectByIndex(6);
        s1.selectByVisibleText("Black Panther");

        System.out.println(s1.isMultiple());
        WebElement first = s1.getFirstSelectedOption();
        System.out.println(first.getText());

        List<WebElement> all = s1.getAllSelectedOptions();
        for (WebElement g:all) {
            System.out.println(g.getText());

        }

        s1.deselectAll();
//
//        Select s1=new Select(multidown);
//        s1.selectByIndex(2);
//        s1.selectByValue("bw");
//        s1.selectByVisibleText("Black Panther");
//      List<WebElement>l= s1.getAllSelectedOptions();
//        for (WebElement web:l) {
//
//            System.out.println(web.getText());
//
//        }








    }
}
