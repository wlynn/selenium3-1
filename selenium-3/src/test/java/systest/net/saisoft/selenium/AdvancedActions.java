package systest.net.saisoft.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActions {
	
	WebDriver driver = new FirefoxDriver();

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void RightCLick1() {
		driver.get("http://localhost:8080/contextclick");
		WebElement menu = driver.findElement(By.id("div-context"));
		
		Actions build = new Actions(driver);
		build.contextClick(menu).click(driver.findElement(By.name("Item 4"))).perform();

	}
	
	
	public void DragAndDrop() {
		driver.get("http://localhost:8080/draganddrop");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions build = new Actions(driver);
		build.dragAndDrop(source, target).perform();
		
		

		
		
			
		
		
	}
	
	
	public void ClickOn() {
		driver.get("http://localhost:8080/selectable");
		WebElement one = driver.findElement(By.name("one"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		WebElement five = driver.findElement(By.name("five"));
		
		Actions build = new Actions(driver);
		//Click on one, Eleven, and Five
		build.click(one).click(eleven).click(five);
		build.perform();
		
		
		
	}
	
	
	
	
	
	public void moveMouse1() {
		driver.get("http://localhost:8080/selectable");
		WebElement one = driver.findElement(By.name("one"));
		WebElement five = driver.findElement(By.name("five"));
		int oneY = one.getLocation().getY();
		int oneX = one.getLocation().getX();
		int fiveY = five.getLocation().getY();
		int fiveX = five.getLocation().getX();
		
		//System.out.println("X coordinate: " + " Y coordinate: " +one.getLocation().getY());
		
		Actions build = new Actions(driver);
		//build.moveByOffset(oneX, oneY);
		build.moveByOffset(oneX + 1, oneY + 1).click().perform();
		build.moveByOffset(fiveX, fiveY).click().perform();
		

		
		
	}
	
	
	
	
	public void keyUpKeyDown() {
		driver.get("http://localhost:8080/selectable");
		WebElement one = driver.findElement(By.name("one"));
		WebElement two = driver.findElement(By.name("two"));
		WebElement five = driver.findElement(By.name("five"));
		
		
		Actions build = new Actions(driver);
		build.keyDown(Keys.CONTROL).click(one).click(two).click(five).keyUp(Keys.CONTROL).perform();
		
	}
	
	
	
	public void doubleClick() {
		driver.get("http://localhost:8080/doubleclick");
		WebElement dbClick = driver.findElement(By.name("dblClick"));
		
		Actions build = new Actions(driver);
		build.moveToElement(dbClick).doubleClick().perform();
		
	}

}
