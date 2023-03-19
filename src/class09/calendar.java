package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class calendar {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://www.delta.com/");
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();
        //get the month

        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        //get the Next Button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
        next.click();
        //click on next button until you find the right month

        boolean isFound =false;
        while (!isFound) {
            //getting month text since motth is a webelement
            String month_ = month.getText();
            if (month_.equalsIgnoreCase("January")) {
                //select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
for (WebElement x:days){

   String day = x.getText();
   if (day.equalsIgnoreCase("20")){
       x.click();
       isFound=true;
       break;
   }

}
            } else {
                next.click();
            }
        }
    }
}
