package TestNGOnePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNGTest {
	
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void Test1() {
	 System.out.println("This is Test1");
	// driver.findElement(By.id("Name")).click();
  }
  
  
  @Test
  public void Test2() {
	  System.out.println("This is Test2"); 
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
