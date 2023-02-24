package class01.Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* * 1. launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
* */
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.close();
        }
    }

