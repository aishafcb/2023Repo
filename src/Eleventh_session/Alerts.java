package Eleventh_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Alerts {
	WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException {
	  //simple alert
		
//	  Thread.sleep(3000); WebElement
//	  simple=driver.findElement(By.id("alertButton")); simple.click();
//	  Thread.sleep(3000); 
//	  driver.switchTo().alert().accept();
//	  Thread.sleep(3000);
//	  
//	  //confirmation pop up
//	  WebElement confirm=driver.findElement(By.xpath("//*[@id='confirmButton']"));
//	  //WebElement confirm= driver.findElement(By.xpath("//*[text()='Click me']"));
//	  Thread.sleep(2000);
//	  confirm.click();
//	  Thread.sleep(3000);
//	  driver.switchTo().alert().dismiss();
	  
	  //prompt popup
	  WebElement prompt=driver.findElement(By.id("promtButton"));
	  Thread.sleep(6000);
	  
	  prompt.click();
	  driver.switchTo().alert().sendKeys("aisha was here");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  
	  driver.navigate().to("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
  
  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
