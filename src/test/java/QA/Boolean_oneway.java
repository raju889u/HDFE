package QA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean_oneway {
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	 boolean printcondition =  driver.findElement(By.xpath("//button[normalize-space()=\"Round Trip\"]")).isDisplayed();
	  
	  System.out.println(printcondition);
	  
WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()=\"Round Trip\"]"));
	  
	  if (ele1.isDisplayed()) {
		  
		  System.out.println("Round trip is there passed");
		  
	  } else {
		  
		  System.out.println("No Not available");
		  
		
	}
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
