package wait_and_mouse_hover;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alertbox_Explicit_wait {

	
     @Test
     public void login() {
     System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
     WebDriver d1;
     d1=new ChromeDriver();

     
     d1.get("http://www.leafground.com/pages/Alert.html");

     WebDriverWait var1=new WebDriverWait(d1,10);

     d1.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();

     var1.until(ExpectedConditions.alertIsPresent());

     Alert a1=d1.switchTo().alert();

     String msg=a1.getText();

     a1.accept();

     System.out.println(msg);
   }

}

