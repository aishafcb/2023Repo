package Eleventh_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Emirate {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[text()='Accept']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[text()='Continue'])[1]"));
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//*[@id='search-flight-date-picker--depart']")).click();
	  WebElement departing= driver.findElement(By.id("search-flight-date-picker--depart"));
      if ( driver.findElement(By.id("search-flight-date-picker--depart")).isEnabled()) {
    	  System.out.println("it exists");
      }else {
    	  System.out.println("it does not exist");
      }
      
      
  }	  
      
      
	  //driver.findElement(By.id("search-flight-date-picker--depart"));
  
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  driver.navigate().to("https://www.emirates.com/us/english/");
	  Thread.sleep(3000);
	 driver.manage().window().maximize();
	  
	  
	  ////*[@id='search-flight-date-picker--depart']
	  ////*[@aria-label='Wednesday, 27  September 2023']
	  ////*[@aria-label='Saturday, 30  September 2023']
	  //(//*[text()='Search flights'])[3]
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }
  
  

}
