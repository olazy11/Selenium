package class07.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        System.out.println("Updated text is "+ text.getText());

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement button = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Button is enabled: "+button.isEnabled());



        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement disableButton = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        if(disableButton.isDisplayed()){
            disableButton.click();
            System.out.println("Button is displayed");
        }else{
            System.out.println("Button is not displayed");
        }


        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        wait5.until(ExpectedConditions.elementToBeSelected (checkbox));
        System.out.println("Checkbox is selected "+checkbox.isSelected());



    }
}
