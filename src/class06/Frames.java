package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");

//  switch to the iframe which contains the input box
//        method :  by index

        driver.switchTo().frame(0);
        //        this statement will shift the focus to the first  frame

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
//        send some text
        textBox.sendKeys("abracadabra");




//      to  get the text "click on the below link"
        driver.switchTo().defaultContent();//we go back to parent window
//        find the text
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());



//
//        get the text "Enter your name" in iframe
        driver.switchTo().frame("iframe_a");//by name
        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("the label is :  "+getLabel.getText());



//        switch focus to the main page
        driver.switchTo().defaultContent();

//        switch to an iframe by WebElment

        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();// clear what ever is written in the text box

    }
}

