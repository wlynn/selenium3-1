import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class tableTest {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://localhost:8080/display");
		WebElement firstRow = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[1]/input"));
		//String cellValue = firstRow.getAttribute("value");
		//System.out.print("Value of the TD is: " +cellValue);
		firstRow.clear();
		firstRow.sendKeys("Updated Name Six");
		driver.findElement(By.name("update")).click();
		//driver.navigate().refresh();
		//Thread.sleep(4000);
		driver.get("http://localhost:8080/display");
		WebElement firstCell = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[1]/input"));
		String cellValue = firstCell.getAttribute("value");
		System.out.print("Value of the TD is: " +cellValue);
		
		
	}
	
	
	public void test3() {
		driver.get("http://localhost:8080/display");
		WebElement firstRow = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[1]/input"));
		String cellValue = firstRow.getAttribute("value");
		System.out.print("Value of the TD is: " +cellValue);
	}
	
	public void test2() {
		driver.get("http://localhost:8080/test");
		WebElement singleCell = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[4]"));
		System.out.print(singleCell.getText());
		
	}

}
