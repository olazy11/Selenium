package class02.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
* */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Olga");
        driver.findElement(By.name("lastname")).sendKeys("Shibaeva");
        driver.findElement(By.name("reg_email__")).sendKeys("olazy11@mail.ru");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("olazy11@mail.ru");
        driver.findElement(By.name("reg_passwd__")).sendKeys("happybird62");
        driver.findElement(By.name("birthday_year")).sendKeys("1975");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();

        Thread.sleep(3000);


        driver.quit();
    }
}
