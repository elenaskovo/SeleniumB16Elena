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
        WebElement userButton=driver.findElement(By.xpath("//button[@type='button']"));
        userButton.click();
       WebElement firstNameEle= driver.findElement(By.xpath("//div[@id='First-Name']//p"));
        String firstName=firstNameEle.getText();
        //String firstName = driver.findElement(By.xpath("//div[@id='First-Name']//p")).getText();
        //System.out.println(firstName);
        String[] userName = firstName.split(":");
        //System.out.println(userName[0]);
        System.out.println(userName[1]);






        //WebElement startBtn=driver.findElement
    }
}
