package TestNGThreePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
	
	private WebDriver driver = null;
	
	
	@BeforeClass
	//Define parameter method
	@Parameters ({"browsers"})
	public void setup(String browsers) {
		if (browsers.equals("FFX")) {//if parameter value is FFX, then webdriver will open firefox 
			System.out.println("Test runs in FireFox");
			driver = new FirefoxDriver();
		} else if (browsers.equals("CRM")) {//if parameter value is CRM, then webdriver will open chrome
			System.out.println("Test runs in Chrome");
			driver = new ChromeDriver();
		}
		driver.get("http://localhost/test");
		
	}
	
	
	@AfterTest 
	public void closeBrowsers() {
		driver.close();
		driver.quit();
	}
	
	
  @Test
  public void GetPageTitle() {
	  String title = driver.getTitle();
	  System.out.println(title);
  }
}
