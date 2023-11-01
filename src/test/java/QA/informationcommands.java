package QA;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Image;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationcommands {
	
	public WebDriver driver;
	
	
	
	
  @Test (priority = 1)
  public void gmail() {
	  String strl = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(strl);
	  
  }
	  
      @Test (priority = 2)
	  public void google_image() {
		String str2 = driver.findElement(By.xpath("//img[@alt=\"Google\"]")).getAttribute("alt");
		  System.out.println(str2);
		  
      }
      
      @Test (priority = 3)
	  public void searchbutton() {
    	  String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
    	  System.out.println(str3);
      
	 }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
