package HWSelenium;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class class6Task2 extends CommonMethods {
    /*
       goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
       click on get new user
       print the firstname of user
        */
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement userButton=driver.findElement(By.xpath("//button [@type='button']"));
        userButton.click();




        //WebElement startBtn=driver.findElement
    }
}
