package HWSelenium;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class class7Task1 extends CommonMethods {
    //goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    //login
    //click on PIM

    //from the table choose any ID
     //print out the row number of that id

    //please make sure that ur code is dynamic enough to cater if another
    // row gets delted , it still prints the row correctly
//username=Admin
//        pass=Hum@nhrm123
    public static void main(String[] args) {
        String url="http:///hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       WebElement userN=driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userN.sendKeys("Admin");
       WebElement passW=driver.findElement(By.xpath("//input[@id='txtPassword']"));
       passW.sendKeys("Hum@nhrm123");
       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       WebElement PIM=driver.findElement(By.xpath(
               "//a[@id='menu_pim_viewPimModule']"));
       PIM.click();
        List<WebElement>listOfId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //55725A
       for(int i=0;i<listOfId.size();i++){
           String idText=listOfId.get(i).getText();
           if(idText.equals("55725A")){
               System.out.println("Row of ID55725A is on: "+(i+1));
           }

}}}
