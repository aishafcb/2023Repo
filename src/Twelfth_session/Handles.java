package Twelfth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Handles {
	//open to windows and go back and forth between them. Also practice implicit and explicit wait time
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  String parent=driver.getWindowHandle();
	  Actions act= new Actions(driver);
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  //driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(20)));
	  WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(10));
	  exp.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Forgot password?"))));
	  
	  WebElement forgot=driver.findElement(By.linkText("Forgot password?"));//extra line??
	  //Thread.sleep(3000);
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  act.keyDown(Keys.SHIFT).click(forgot).keyUp(Keys.SHIFT).build().perform();
	  Set<String> sessions=driver.getWindowHandles();
	  System.out.println(sessions);
	  WebElement email=driver.findElement(By.name("email"));
	  email.sendKeys("abcdef@hotmail.com");
	  Thread.sleep(2000);
	
	  for (String i:sessions) {
	  System.out.println(i);
	  if (!i.equals(parent)) {
		  driver.switchTo().window(parent);
	  }
	  driver.findElement(By.id("pass")).sendKeys("12345678");
	  }
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(opt);
	  driver.navigate().to("http://www.facebook.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
