package systest.net.saisoft.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementTest {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void test() throws IOException {
		
		//Create Object of Properties class
		Properties obj = new Properties();
		//Create object of FileInputStream and tell it where to find our file
		FileInputStream objFile = new FileInputStream("element.properties");
		//Load elements
		obj.load(objFile);
		

		driver.get("http://localhost:8080/add");
		String myName = "Brooke";
		
		//Use properties file to find the ID of the web element
		driver.findElement(By.xpath(obj.getProperty("emailAddress"))).sendKeys(myName);
		System.out.println();
		
		
	}

}
