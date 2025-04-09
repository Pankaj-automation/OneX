package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
//  @Test(priority = 1)
  public void f() {
	   driver = new ChromeDriver();
		  driver.get("https://www.google.com");

  }

  @Test(priority = 2)
  public void T() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Page Title: " + driver.getTitle());
	  System.out.println("Current URL: " + driver.getCurrentUrl());
  }
  
  @Test(priority = 3)
  public void j() throws InterruptedException {
	  Thread.sleep(2000);
      driver.quit();  }
}
