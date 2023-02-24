package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

//        connect to webDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
//
//        initate the instance of Webdriver
        WebDriver driver= new ChromeDriver();
//
//        open google .com
        driver.get("https://google.com");//we cannot move ,refresh/will wait until the webpage has loaded
//
//        slow dowd
        Thread.sleep(2000);
//
//        now navigate to umschool
        driver.navigate().to("https://umschool.net/profile/");//
        // we can mobve forward,back, refresh/does not wait until webpage has loaded
//
//        slow down
        Thread.sleep(2000);
//
//        go back
        driver.navigate().back();

        //        slow down
        Thread.sleep(2000);
//
//        goto facebook
        driver.navigate().forward();

        Thread.sleep(2000);
//        refresh the page

        driver.navigate().refresh();
//        close the browser
        driver.close();//close current tab



    }
}

