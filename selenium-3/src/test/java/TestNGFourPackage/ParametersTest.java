package TestNGFourPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	private  WebDriver driver=null;
	
	 @BeforeClass
	//parameter value will retrieved from testng.xml file's <parameter> tag.
	 @Parameters ({"browser"})
	 public void setup(String browser){//Method will pass value of parameter.
	  if (browser.equals("FFX")) {//If value Is FFX then webdriver will open Firefox Browser.
	   System.out.println("Test Starts Running In Firefox Browser.");
	   driver = new FirefoxDriver();   
	  }else if (browser.equals("CRM")){//If value Is CRM then webdriver will open chrome Browser.
	   System.out.println("Test Starts Running In Google chrome.");
	   driver = new ChromeDriver();   
	  }
	  driver.manage().window().maximize();
	  driver.get("http://www.amazon.com");  
	 } 
	 //Both tests will be executed in both browsers
	 @Test
	 public void verify_title(){   
	   String url = driver.getCurrentUrl();
	   String title = driver.getTitle();
	   Assert.assertEquals("http://www.amazon.com/", url);
	   //Assert.assertEquals("Selenium Test", title);
	   System.out.println("Title Is Fine.");   
	 } 
//	 @Test
//	 public void Add_Name(){  
//	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test First Name");
//	  driver.findElement(By.xpath("//input[@type='lastName']")).sendKeys("Test Last Name");
//	  driver.findElement(By.xpath("//input[@value='submit']")).click();
//	  
	    
//	 } 
	 @AfterClass 
	 public void closebrowser(){
	   driver.quit();  
	 }
	}
