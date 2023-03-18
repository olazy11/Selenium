package class08.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/*
1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath*/
public class task1 {
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
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[10]/td[2]"));

        for (int i = 0; i < column.size(); i++) {
            String text = column.get(i).getText();
            if (text.equalsIgnoreCase("51852A")) {
                System.out.println("51852A is in the list on index" + i);
                System.out.println("51852A ms is in the table on index" + (i + 1));
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[10]/td[1]")).click();

            }
        }
    }
}
