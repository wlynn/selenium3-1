package systest.net.saisoft.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExamples {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
	@Test
	public void WaitforInVisible() {
		driver.get("http://localhost:8080/test");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("fid")));

	}
	
	public void WaitforVisible() {
		driver.get("http://localhost:8080/test");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fid")));
		
	}
	
	
	
	public void WaitforTitle() {
		driver.get("http://localhost:8080/test");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Test2 Something"));
		
	}
	
	
	
	
	public void WaitforAlert() {
		driver.get("http://localhost:8080/test");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
	}
	
	
	public void WaitforText() {
		driver.get("http://localhost:8080/test");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h4"), "Test Table"));
		
	}
	
	public void WaitforButton() {
		driver.get("http://localhost:8080/add");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
			
	}
	
	
	public void MoreWaitTests() {
		driver.get("http://localhost:8080/add");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Brooke");
		driver.findElement(By.id("lastName")).sendKeys("Davis");

		
	}

}
