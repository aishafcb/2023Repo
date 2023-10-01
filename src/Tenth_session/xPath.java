package Tenth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
//Use relative xpath to go to first name, last name, mobile number and click sign up button
public class xPath {
	WebDriver driver;
	
  @Test
  public void f() throws Exception    {
	  //WebElement account=driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	  //WebElement account=driver.findElement(By.xpath("//*[contains(@id,'u_0_')]"));
	  //WebElement account=driver.findElement(By.xpath("//*[contains(@role,'button')]"));
	  WebElement account=driver.findElement(By.xpath("//*[starts-with(@data-testid,'open-')]")); //worked
	  account.click();
	  Thread.sleep(6000);
	/*  WebElement name  =driver.findElement(By.xpath("//input[@name='firstname']"));
	  name.sendKeys("Ash");
	  WebElement lastname=driver.findElement(By.xpath("//*[@aria-label='Last name']"));
	  lastname.sendKeys("bash");
	  WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	  mobile.sendKeys("1234567890");
	  */
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      ChromeOptions opt = new ChromeOptions();
      opt.addArguments("--remote-allow-origins=*");
   driver= new ChromeDriver(opt);
  driver.navigate().to("http://www.facebook.com");
  
  }

  @AfterClass
  public void afterClass() {
  }

}
