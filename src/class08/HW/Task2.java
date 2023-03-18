package class08.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i < column.size(); i++) {
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("52328A")){
                System.out.println("id index in the list is "+i);
                System.out.println("id index is in the table is "+(i+1));
                driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
        }




    }
}
