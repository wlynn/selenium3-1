package systest.net.saisoft.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickCheckbox {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	
	@Test
	public void test() {
		driver.navigate().to("http://amazon.com");
		driver.navigate().to("http://www.google.com");
		//Go back to Amazon
		driver.navigate().back();
		//Go back to Google
		driver.navigate().forward();
		
		
	}

}
