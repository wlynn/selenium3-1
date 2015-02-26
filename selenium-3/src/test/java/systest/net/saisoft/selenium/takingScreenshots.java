package systest.net.saisoft.selenium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class takingScreenshots {
	
	//WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test1() throws IOException {
		Map capabilitiesMap = new HashMap();
		capabilitiesMap.put("takesScreenshot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://localhost:8080/test");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("screenshot.jpg"));
		
		
		driver.close();
		driver.quit();
		
	}

}
