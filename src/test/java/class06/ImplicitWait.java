package class06;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // declaring the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement createNewAccountBtn=driver.findElement(By.xpath("//[text()='Create an account"));
        createNewAccountBtn.click();
        //        Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        //endText.("abracadabra");
    }
}
