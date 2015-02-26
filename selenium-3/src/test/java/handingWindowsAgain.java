import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class handingWindowsAgain {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://localhost:8080/test");
		String window1 = driver.getWindowHandle();
		System.out.println("First Window Handle is: "+window1);
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		
		Stack<String> windowHandles = new Stack<String>();
		windowHandles.addAll(driver.getWindowHandles());
		String popupWindowHandle = windowHandles.pop();
		System.out.println("Second Window Handle is: "+ popupWindowHandle);
		
		Thread.sleep(5000);
		driver.switchTo().window(popupWindowHandle);
		System.out.println("Current URL of second window: "+driver.getCurrentUrl());
		assertEquals("http://www.amazon.com/", driver.getCurrentUrl());
		
		//String window2 = driver.getWindowHandle();
		//System.out.println("Second Window Handle is: "+winHandle);
		//Thread.sleep(5000);
		//driver.switchTo().window(window2);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getWindowHandles().toString());
		//System.out.println("Number of window handles so far: "+driver.getWindowHandles().size());
		//driver.switchTo().window(window1);
		//assertEquals("Selenium Test Page", driver.getTitle());
		//System.out.println(driver.getTitle());
		
	}

}
