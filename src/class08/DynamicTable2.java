package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable2 {
    public static void main(String[] args) {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

    //        create an instance of WebDriver
    WebDriver driver = new ChromeDriver();
//        max the window
    driver.manage().window().maximize();
//        goto syntax projects.com
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
    WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
    username.sendKeys("Tester");
    WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
    password.sendKeys("test");
    WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
    loginButton.click();


//       /task : print all the eneteries that have  my money in the product
//        1.locator
    List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));

//        iterate
//        tell me the row number of money in the table on the website
//        check the checkbox that contains money
    for(int i=0;i<column.size();i++){
//            text
        String text = column.get(i).getText();
        if(text.equalsIgnoreCase("FamilyAlbum")){
            System.out.println("money is in the list on index"+i);
            System.out.println("money is in the table on index"+(i+2));
            driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]")).click();

        }



    }




}
}


