package Eleventh_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.openqa.selenium.interactions.Actions;


public class Amazon {
	 WebDriver driver;

@Test
  public void f() throws InterruptedException {
	
	Actions act = new Actions(driver);
	WebElement pointer=driver.findElement(By.id("nav-link-accountList"));
	act.moveToElement(pointer).perform();
	Thread.sleep(5000);
	System.out.println(driver.getCurrentUrl());
	WebElement rec= driver.findElement(By.linkText("Recommendations"));
	act.moveToElement(rec).click().build().perform();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
//
 }
  @BeforeClass
  public  void beforeClass() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	 driver.navigate().to("https://www.amazon.com/gp/css/homepage.html/ref=nav_bb_ya");
	 Thread.sleep(3000);
	 //System.out.println(driver.getCurrentUrl());
	//Actions act= new Actions();
	 
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
