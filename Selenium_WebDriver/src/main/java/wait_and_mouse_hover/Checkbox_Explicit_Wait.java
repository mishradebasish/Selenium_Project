package wait_and_mouse_hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkbox_Explicit_Wait {

	
     @Test
     public void login() {
     System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
     WebDriver d1;
     d1=new ChromeDriver();

     
     d1.get("http://www.leafground.com/pages/checkbox.html");

     WebDriverWait var1=new WebDriverWait(d1,10);

     var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contentblock']/section/div[1]/div[3]/input")));

     d1.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[3]/input")).click();

   }

     
}

