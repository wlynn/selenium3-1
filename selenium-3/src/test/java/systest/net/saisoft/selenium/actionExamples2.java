package systest.net.saisoft.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionExamples2 {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://localhost:8080/sortable");
		WebElement three = driver.findElement(By.name("three"));

		Actions builder = new Actions(driver);
		// Move tile3 to the position of tile2
		builder.clickAndHold(three).moveByOffset(120, 0).release().perform();
	}
}

