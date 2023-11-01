package QA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class screenshot {
	
	public WebDriver driver;
  @Test
  public void function() {
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
	  String ATM = "Apple";
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\AsuS\\Desktop\\KCR\\screens\\"+ATM+".png"));
	  
	  	
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
