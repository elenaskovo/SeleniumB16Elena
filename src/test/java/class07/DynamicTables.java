package class07;

import Utiils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables extends CommonMethods{


        public static void main(String[] args) {
            String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);
            WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
            userName.sendKeys("Admin");
            WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            passWord.sendKeys("Hum@nhrm123");
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginButton.click();
            //        click on PIM
            WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pimBtn.click();


            //        print the row number of the row that has the id 56247A
            List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
//        look for 56247A
            for(int i=0;i<allIDs.size();i++){
                String id = allIDs.get(i).getText();
                if(id.equals("56247A")){
                    System.out.println("the id is on row number "+(i+1));
                }


            }}}
