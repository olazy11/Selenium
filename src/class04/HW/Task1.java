package class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

/*HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
* */
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelectedCheckBox = checkBox.isSelected();
        System.out.println("The CheckBox button is selected " + isSelectedCheckBox);

        if (!isSelectedCheckBox) {
            checkBox.click();
        }
       isSelectedCheckBox = checkBox.isSelected();
        System.out.println("The CheckBox button is selected " + isSelectedCheckBox);
        driver.quit();
    }
}
