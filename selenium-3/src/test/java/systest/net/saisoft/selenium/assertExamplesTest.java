package systest.net.saisoft.selenium;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assertExamplesTest {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	
	public void GreenPeppersSelected() throws InterruptedException {
		driver.get("http://localhost:8080/test");
		WebElement checkbox = driver.findElement(By.name("greenpeppers"));
		//Verify that green peppers is not selected
		//assertTrue(checkbox.isSelected());
		//Select green peppers
		checkbox.click();
		//Verify that green peppers is selected
		Thread.sleep(3000);
		assertFalse(checkbox.isSelected());
	}
	
	
	
	@Test
	public void FindTDValye() {
		driver.get("http://localhost:8080/test");
		WebElement td = driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[2]"));
		System.out.println(td.getText());
		assertEquals("13", td.getText());
		//assertTrue(textbox.getAttribute("value").contains(""));
		//assertNotNull(textbox.getAttribute("disabled"));
		
		
	}
	
	
	public void assertNullExample() {
		driver.get("http://localhost:8080/test");
		WebElement textbox = driver.findElement(By.name("fname"));
		//System.out.println(textbox.getAttribute("enabled"));
		assertTrue(textbox.getAttribute("value").contains(""));
		//assertNotNull(textbox.getAttribute("disabled"));
		
		
	}
	
	
	public void MushroomsSelected() throws InterruptedException {
		driver.get("http://localhost:8080/test");
		WebElement checkbox = driver.findElement(By.name("mushrooms"));
		//Verify that mushrooms is selected 
		assertTrue(checkbox.isSelected());
		//Clear the checkbox
		checkbox.click();
		//Verify that mushrooms is cleared
		Thread.sleep(4000);
		assertFalse(checkbox.isSelected());
		
	}
	
	public void assertFalseExample() {
		driver.get("http://localhost:8080/test");
		WebElement checkbox = driver.findElement(By.name("mushrooms"));
		assertFalse(checkbox.isSelected());
	}
	
	
	public void assertTrueExample() {
		driver.get("http://localhost:8080/test");
		WebElement checkbox = driver.findElement(By.name("greenpeppers"));
		assertTrue(checkbox.isSelected());
	}
	
	public void assertNotEqualsExample() {
		driver.get("http://localhost:8080/display");
		String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
		assertNotEquals("Display entries", pageTitle);
	}
	
	
	public void assertEqualsExample() {
		driver.get("http://localhost:8080/display");
		String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
		assertEquals("Display Entries", pageTitle);
		
	}

}
