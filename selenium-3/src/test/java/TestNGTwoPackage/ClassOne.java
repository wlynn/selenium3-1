package TestNGTwoPackage;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassOne {
	
	WebDriver driver = new FirefoxDriver();
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
  @SuppressWarnings("deprecation")
@Test
  public void MethodOne() {
	  
	  driver.navigate().to("http://www.amazon.com");
	  String title = driver.getTitle();
	  Assert.assertEquals("Amazon.com", title);
	  System.out.print("\nCurrent page title is : "+title);
    
  }
}
