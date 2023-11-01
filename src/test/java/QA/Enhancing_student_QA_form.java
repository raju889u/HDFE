package QA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Enhancing_student_QA_form {
	
	public WebDriver driver;
	
  @Test
  public void improvement() throws Exception {
	  
	  driver.findElement(By.id("firstName")).sendKeys("Raju");
	  driver.findElement(By.id("lastName")).sendKeys("ch");
	  
	  driver.findElement(By.id("userEmail")).sendKeys("rajuch889@gmail.com");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//label[normalize-space()=\"Male\"]")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNumber")).sendKeys("9963761389");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("dateOfBirthInput")).click();
	new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"))).selectByVisibleText("October");
	  new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"))).selectByVisibleText("1993");
	  driver.findElement(By.xpath("//div[@aria-label=\"Choose Friday, October 8th, 1993\"]")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("subjectsInput")).sendKeys("social studies");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//label[normalize-space()=\"Sports\"]")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\AsuS\\Desktop\\Testing Docs\\ABOUT SQL.jpeg");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("currentAddress")).sendKeys("vijayawada city");
	  driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  driver.switchTo().activeElement().sendKeys("NCR");
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  driver.switchTo().activeElement().sendKeys("Delhi");
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  driver.switchTo().activeElement().sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("submit")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("closeLargeModal")).click();
	  Thread.sleep(3000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
