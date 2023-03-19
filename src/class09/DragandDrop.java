package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable");


        driver.switchTo().frame(0);

//        get the element which u want to drag
        WebElement draggable = driver.findElement(By.id("draggable"));

//        get the dropable element

        WebElement dropable = driver.findElement(By.id("droppable"));

// action class
        Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();

    }
}
