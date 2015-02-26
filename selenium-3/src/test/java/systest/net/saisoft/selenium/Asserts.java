package systest.net.saisoft.selenium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Asserts {
	
	//WebDriver driver = new FirefoxDriver();
	


	@Test
	public void test() throws IOException {
		
		Map capabiltiesMap = new HashMap();
		capabiltiesMap.put("takesScreenshot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabiltiesMap);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.navigate().to("http://localhost:8080/test");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot.jpg"));
		
	}

}
