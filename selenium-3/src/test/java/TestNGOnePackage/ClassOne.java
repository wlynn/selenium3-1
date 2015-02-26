package TestNGOnePackage;

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
	
	@Test
	  public void One() {
		  
		  driver.navigate().to("http://www.google.com");
		  String title = driver.getTitle();
		  System.out.print("\nCurrent page title is : "+title);
	    
	  }
	
  @Test
  public void MethodOne() {
	  
	  driver.navigate().to("http://www.amazon.com");
	  String title = driver.getTitle();
	  System.out.print("\nCurrent page title is : "+title);
    
  }
  
  @Test
  public void MethodTwo() {
	  
	  driver.navigate().to("http://www.amazon.com");
	  String title = driver.getTitle();
	  System.out.print("\nCurrent page title is : "+title);
    
  }
  
  @Test
  public void MethodThree() {
	  
	  driver.navigate().to("http://www.amazon.com");
	  String title = driver.getTitle();
	  System.out.print("\nCurrent page title is : "+title);
    
  }
  
  
  
}
