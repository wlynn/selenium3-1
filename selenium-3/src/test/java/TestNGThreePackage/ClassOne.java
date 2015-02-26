package TestNGThreePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
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
  public void SkipTest() {
		driver.get("http://localhost:8080/test");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Test Page")) {
			//Skipping this test
			throw new SkipException("Skip Test is skipped because title does match");
		} else {
			System.out.println("Check the checkbox");
			driver.findElement(By.name("greenpeppers")).click();
		}
		
		
		
		
  }
}
