package Tenth_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//use by Name and also use SELECT class to select month, day and year on sign up page
//Select   by value, by text, by index
public class signUp {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement createAcct=driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	  createAcct.click();
	  Thread.sleep(2000);
	WebElement month= driver.findElement(By.name("birthday_month"));  //using Name locator
	Select dropdown1= new Select(month); //using select class
	dropdown1.selectByValue("10");    //by Value
	
	WebElement date=driver.findElement(By.name("birthday_day"));
	Select dropdown2= new Select(date);
	dropdown2.selectByVisibleText("12");
	
	WebElement year=driver.findElement(By.name("birthday_year"));
	Select dropdown3= new Select(year);
	dropdown3.selectByIndex(39);
	Thread.sleep(5000);
	
	
	
  }
  
  
  @BeforeClass 
 public void beforeClass()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(opt);
	driver.get("http://www.facebook.com");
	
  }
  
 @AfterClass
 public void afterClass() {
	 driver.quit();
 }
  
}
