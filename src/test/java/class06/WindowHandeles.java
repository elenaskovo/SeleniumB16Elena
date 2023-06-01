package class06;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandeles extends CommonMethods {
    public static void main(String[] args) {
        String url="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement helpBtn=driver.findElement(By.linkText("Help"));
        helpBtn.click();
        WebElement privacyBtn=driver.findElement(By.xpath("//a[text() ='Privacy']"));
        privacyBtn.click();
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("main page handle");
        //get all the window handles and print the titles associated with each window handle
        Set<String>allHandles=driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
          //  System.out.println("the title associated with"+handle+" is :"+title);


        }
        //focus shifted to correct page
        System.out.println("the current page is: "+driver.getTitle());

//switch focus to main page
        driver.switchTo().window(mainPageHandle);
        System.out.println("the focus is on :"+driver.getTitle());




    }
}
