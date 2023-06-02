package HWSelenium;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class class6Task1 extends CommonMethods {
    //HW1:
    //goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    //click on start
    //print the text  "welcome syntax technologies "on console
    //Syntax - Website to practice Syntax Automation Platform
    //Syntax Automation Platform has great examples like Ajax, JQuery,
    // Bootstrap etc which are used in most of the web applications around the world.
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement helpBtn=driver.findElement(By.xpath("//button[@id='startButton']"));
        helpBtn.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//
        WebElement textBox = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.visibilityOf(textBox));

        System.out.println(textBox.getText());
    }
}
