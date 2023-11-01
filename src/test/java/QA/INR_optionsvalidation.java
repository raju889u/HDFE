package QA;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class INR_optionsvalidation {
	public WebDriver driver;
	
	
	
  @Test
  public void options() {
	  
List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  
	System.out.println(allvalues.get(13).getText());
	
	for (int i = 0; i < allvalues.size(); i++) {
		
	System.out.println(allvalues.get(i).getText());
	
	
	if (allvalues.get(i).getText().equalsIgnoreCase("18")) {
		
		System.out.println("yes i am 18 passed");
		
	} else {
		
		System.out.println("Not matched");

	}
		
		
		
		
	}
	
	
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
