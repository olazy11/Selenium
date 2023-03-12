package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        goto facebook.com
        driver.get("https://www.facebook.com");
//click on the create new account
        driver.findElement(By.linkText("Create new account")).click();
//
//send your firstname
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");



    }
}


