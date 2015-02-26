import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class handlingWindows {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://localhost:8080/test");
		String window1 = driver.getWindowHandle();
		System.out.println("First Window Handle is: "+window1);
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		String window2 = driver.getWindowHandle();
		System.out.println("Second window handle is: "+window2);
		System.out.println("Number of window handles so far: "+driver.getWindowHandles().size());
		driver.switchTo().window(window1);
	}

}
