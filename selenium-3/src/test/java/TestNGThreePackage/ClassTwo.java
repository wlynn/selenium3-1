package TestNGThreePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassTwo {
	
	WebDriver driver = new FirefoxDriver();
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	
  @Test (priority=1, enabled = false)
  public void Test1() {
	  System.out.println("This is Test 1");
  }
  
  @Test (groups={"Group1"})
  public void Group1_Test1() {
	  System.out.println("This is Test 1");
  }
  
  @Test (groups={"Group1"})
  public void Group1_Test2() {
	  System.out.println("This is Test 1");
  }
  
  
  @Test (priority=2, dependsOnMethods={"Test3"})
  public void Test4() {
	  System.out.println("This is Test 4");
  }
  
  
  @Test (priority=3)
  public void Test3() {
	  System.out.println("This is Test 3");
  }
  
  @Test (expectedExceptions = NoSuchElementException.class)
  public void Test2() {
	  System.out.println("This is Test 2");
	  driver.findElement(By.name("name")).click();
	  
  }
  
}
