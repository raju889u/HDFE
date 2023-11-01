package QA;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class popupwindow {
	public WebDriver driver;
	
	
	
	
  @Test
  public void windowpopup() throws Exception  {
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(3000);
		
  String backtoparentwindow = driver.getWindowHandle();
  
		
		
        for(String childwindowandle : driver.getWindowHandles()) {
        
        	driver.switchTo().window(childwindowandle);
        	
        }
        
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Blog']"));
	
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(backtoparentwindow);
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		
		
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
