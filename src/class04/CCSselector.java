package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCSselector {//CSS stands for Cascading Style Sheets
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement webElement = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));//creatd webelement to reuse this variable  later
        webElement.click();
Thread.sleep(2000);//if does not work =use sleep, it gives the browser time to open up a new window
      WebElement firstname =  driver.findElement(By.cssSelector("input[name='firstname']"));
      firstname.sendKeys("Olga");


    }
}
