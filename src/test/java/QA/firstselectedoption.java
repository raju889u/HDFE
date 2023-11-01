package QA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class firstselectedoption {
	
	public WebDriver driver;
	
	
  @Test
  public void optionss () {
	  
	  WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
	  
	  System.out.println(ele.getText());
	  
	  if (ele.getText().contains("27")) {
		  
		  System.out.println("passed default value is 27");
		  
	  } else {
		  
		  System.out.println("dont missed its fail");
		  
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
