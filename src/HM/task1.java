package HM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*HW
use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php (edited)
enter the message in the text box

click on show message

Enter value of a (edited)

Enter value of B

click on the button get total

also please print the value of the attribute type of the button GET TOTAL
* */
public class task1 {
    public static void main(String[] args) {


     System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php ");
      WebElement message = driver.findElement(By.xpath("//input[@id= 'user-message']"));
      message.sendKeys("Hello, lovely people,lets do some math");

      WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
      showMessage.click();

      WebElement aValue = driver.findElement(By.xpath("//input[@id= 'sum1']"));
      aValue.sendKeys("10");

     WebElement aValue2 = driver.findElement(By.xpath("//input[@id= 'sum2']"));
     aValue2.sendKeys("20");


     WebElement total = driver.findElement(By.xpath("//button[text() ='Get Total']"));
     total.click();


     System.out.println(total.getAttribute("type"));

     driver.quit();


    }
}


