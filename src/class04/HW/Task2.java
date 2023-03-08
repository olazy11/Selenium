package class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

* */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkButtons = driver.findElements(By.cssSelector("input[class='cb1-element']"));

        for (WebElement checkBtn : checkButtons) {
            String options = checkBtn.getAttribute("value");
            if (options.equalsIgnoreCase("Option-4")) {
                checkBtn.click();
                Thread.sleep(2000);
                driver.quit();
            }
        }
    }
}


