import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteMachineTest {


	@Test
	public void test() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Tell Selenium Grid to use Windows 8 for the test
		//capabilities.setPlatform(Platform.WIN8_1);
		//Tell Selenium Grid to use Chrome browser for the test
		capabilities.setBrowserName("chrome");
		RemoteWebDriver remoteWD = null;
		try {
			remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:1111/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		remoteWD.get("http://www.google.com");
		WebElement element = remoteWD.findElement(By.name("q"));
		element.sendKeys("selenium grid");
		remoteWD = (RemoteWebDriver) new Augmenter().augment(remoteWD);
		File srcFile = ((TakesScreenshot)remoteWD).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("remoteScreenshot.jpg"));
		
		remoteWD.close();
		remoteWD.quit();
	}

	
	@Test
	  public void One() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setPlatform(Platform.WIN8_1);
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteWD = null;
		try {
			remoteWD = new RemoteWebDriver(new URL("http://127.0.0.1:1111/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		  
		  remoteWD.navigate().to("http://www.amazon.com");
		  String title = remoteWD.getTitle();
		  System.out.print("\nCurrent page title is : "+title);
		  
		  remoteWD.close();
		  remoteWD.quit();
	    
	  }
	
}
