package wait_and_mouse_hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Textbox_Explicit_Wait {

	
     @Test
     public void login() {
     System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
     WebDriver d1;
     d1=new ChromeDriver();

     
     d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

     WebDriverWait var1=new WebDriverWait(d1,10);

     var1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));

     d1.findElement(By.id("ap_email")).sendKeys("debasishmishra1996@gmail.com");

     d1.findElement(By.id("continue")).click();

    }

}
