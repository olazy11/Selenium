package class02.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browse
* */
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Olga");
        driver.findElement(By.id("customer.lastName")).sendKeys("Shibaeva");
        driver.findElement(By.name("customer.address.street")).sendKeys("Gagarina 101");
        driver.findElement(By.name("customer.address.city")).sendKeys("Kaliningrad");
        driver.findElement(By.name("customer.address.state")).sendKeys("RF");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("236038");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("79062193010");
        driver.findElement(By.name("customer.ssn")).sendKeys("105987903");
        driver.findElement(By.name("customer.username")).sendKeys("olazy");
        driver.findElement(By.name("customer.password")).sendKeys("happylife86");
        driver.findElement(By.name("repeatedPassword")).sendKeys("happylife86");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
