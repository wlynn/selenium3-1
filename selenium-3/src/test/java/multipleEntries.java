import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class multipleEntries {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test1() throws IOException, JXLException {
		
		//Create Properties object
		Properties obj = new Properties();
		FileInputStream objFile = new FileInputStream("add.properties");
		//Load
		obj.load(objFile);
		
		FileInputStream file = new FileInputStream("TestData2.xls");
		Workbook w = Workbook.getWorkbook(file);
		Sheet s;
		
		s = w.getSheet(0);
		
		for(int row=1; row < s.getRows(); row++)
		{
			
		driver.get("http://localhost:8080/add");
		String firstName = s.getCell(0, row).getContents();
		System.out.println("First Name: "+firstName);
		driver.findElement(By.id(obj.getProperty("firstName"))).sendKeys(firstName);
		String lastName = s.getCell(1, row).getContents();
		System.out.println("Last Name: "+lastName);
		driver.findElement(By.id(obj.getProperty("lastName"))).sendKeys(lastName);
		String email = s.getCell(2, row).getContents();
		System.out.println("Email: "+email);
		driver.findElement(By.id(obj.getProperty("emailAddress"))).sendKeys(email);
		driver.findElement(By.id(obj.getProperty("activeTrue"))).click();
		String age = s.getCell(3, row).getContents();
		System.out.println("Age is: "+age);
		driver.findElement(By.id(obj.getProperty("age"))).sendKeys(age);
		driver.findElement(By.name(obj.getProperty("submitButton"))).click();
		
		}
		
		}

}
