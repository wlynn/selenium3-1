import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class dataDriven {
	
	WebDriver driver = new FirefoxDriver();
	

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
		
	}

	@Test
	public void test() throws BiffException, IOException {
		FileInputStream fi = new FileInputStream("TestData.xls"); 
		Workbook w = Workbook.getWorkbook(fi); 
		Sheet s;
		
		s = w.getSheet(0); 
		
		for(int row=1; row < s.getRows();row++) 
			//Add all true entries, reads thru the excel spreadsheet until it reaches the end of the file
			
			{ 	
				driver.get("http://localhost:8080/add");
				String firstName = s.getCell(0, row).getContents(); 
				System.out.println("First Name: "+firstName);  
				driver.findElement(By.id("firstName")).sendKeys(firstName);
				String lastName = s.getCell(1, row).getContents(); 
				System.out.println("Last Name: "+lastName); 
				driver.findElement(By.id("lastName")).sendKeys(lastName);
				String email = s.getCell(2, row).getContents(); 
				System.out.println("Email: "+email); 
				driver.findElement(By.id("emailAddress")).sendKeys(email); 
				driver.findElement(By.id("active1")).click();
				String age = s.getCell(4, row).getContents(); 
				System.out.println("Age: "+age); 
				driver.findElement(By.id("age")).sendKeys(age);
				driver.findElement(By.name("submit")).click();
				
			}
	}

}
