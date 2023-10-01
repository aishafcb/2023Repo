package Ninth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Annotations {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  //navigate to URL, refresh, back, forth and maximize window
	  driver.navigate().to("http://amazon.com");
//	  driver.navigate().refresh();
//	  driver.navigate().back();
//	  driver.navigate().forward();
//	  driver.manage().window().maximize();
//	  driver.manage().window().minimize();
	 WebElement field= driver.findElement(By.id("twotabsearchtextbox"));
	 Thread.sleep(6000);
	 field.sendKeys("computer");
	 field.submit();
	 //WebElement alexa=driver.findElement(By.linkText("Works with Alexa"));
	 WebElement alexa=driver.findElement(By.partialLinkText("Works"));
	 Thread.sleep(6000);
	 alexa.click();
  }
  
  
  @BeforeClass
  public void beforeClass() {
	//set browser and open it 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	driver=new ChromeDriver(option);
	
  
  }

  @AfterClass
  public void afterClass() {
	  //close or quit browser
	  driver.close();
  }

}
