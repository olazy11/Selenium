package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingElements {

    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        open up fb.com
        driver.get("https://www.facebook.com/");

//  send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");

//send the password
        driver.findElement(By.name("pass")).sendKeys("abracdabra");

//        click on the button create New Account
//        driver.findElement(By.linkText("Create new account")).click();

//        click on forgotten password

        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();
    }
}