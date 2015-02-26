package systest.net.saisoft.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class dialogTests {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void TestAll() {
		alertTest();
		confirmTest();
		promptTest();
	}
	
	
	public void alertTest() {
		driver.get("http://localhost:8080/test");
		//Locate alert
		Alert a1 = driver.switchTo().alert();
		//Read the alert text
		String alertText = a1.getText();
		System.out.println(alertText);
		//Click OK button
		a1.accept();
	}
	
	
	public void confirmTest() {
	
		//Locate confirm
		Alert a2 = driver.switchTo().alert();
		//Read the confirm text
		String confirmText = a2.getText();
		System.out.println(confirmText);
		//Click Cancel button
		a2.dismiss();
	}
	
	public void promptTest() {
		
		//Locate prompt
		Alert a3 = driver.switchTo().alert();
		//Read the prompt text
		String promptText = a3.getText();
		System.out.println(promptText);
		//typing text into the text box of the prompt
		a3.sendKeys("Sending text to the prompt");
		//Click OK button
		a3.accept();
	}

}
