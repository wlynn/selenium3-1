package systest.net.saisoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataDriven_TestNG {
  @Test(dataProvider = "dp")
  public void f(String first, String last, String email, String age) {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://localhost:8080/add");
	  
	  WebElement firstName = driver.findElement(By.id("firstName"));
	  firstName.clear();
	  firstName.sendKeys(first);
	  
	  WebElement lastName = driver.findElement(By.id("lastName"));
	  lastName.clear();
	  lastName.sendKeys(last);
	  
	  WebElement emailAddress = driver.findElement(By.id("emailAddress"));
	  emailAddress.clear();
	  emailAddress.sendKeys(email);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new first [] { "first name", "last name", "email again", "13" },
      new second [] { "first name again", "last name again", "email second", "15" },
    };
  }
  

}
