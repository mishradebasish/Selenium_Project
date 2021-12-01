package wait_and_mouse_hover;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicit_Wait {

	
     @Test
     public void login() {
     System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver.exe");
     WebDriver d1;
     d1=new ChromeDriver();

     
     d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     d1.get("http://www.leafground.com/pages/Window.html");

     System.out.println(d1.getTitle());

     System.out.println(d1.getCurrentUrl());

     System.out.println(d1.getPageSource());

     d1.navigate().back();

     d1.navigate().forward();

     d1.navigate().refresh();

     d1.navigate().to("http://demo.automationtesting.in/Windows.html");

     d1.manage().window().maximize();

     Dimension dim1 = new Dimension(350,250);

     d1.manage().window().setSize(dim1);
   
     }

}