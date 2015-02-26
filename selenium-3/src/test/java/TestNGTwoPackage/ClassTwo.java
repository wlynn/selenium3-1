package TestNGTwoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassTwo {
	
	WebDriver driver = new FirefoxDriver();
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
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
}
