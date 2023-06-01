package HWSelenium;

import Utiils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class class5Task1 extends CommonMethods {
     /*
        task: HW1:
        http://practice.syntaxtechs.net/javascript-alert-box-demo.php
        click on the last alert
        send keys and accept it
        Note: don't worry if the text you send doesn't appear up in the text box
         */
     public static void main(String[] args) {
         String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
         String browser="chrome";
         openBrowserAndLaunchApplication(url,browser);
         WebElement button= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
         button.click();
         Alert alert=driver.switchTo().alert();
         alert.sendKeys("open");
         alert.accept();

     }

}
