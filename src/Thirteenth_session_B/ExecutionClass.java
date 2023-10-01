package Thirteenth_session_B;

import org.testng.annotations.Test;

import Thirteenth_session_A.ForgotPassPage;
import Thirteenth_session_A.LandingPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ExecutionClass {
	WebDriver driver;
	
  @Test(priority=1)
  public  void Login() throws InterruptedException {
	  LandingPage obj1= new LandingPage(driver);
	  obj1.enterUsername("aisha");
	  obj1.enterPwd("12345");
	  obj1.clickLogin();
	  Thread.sleep(5);
	  driver.navigate().back();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @Test(priority = 2)
  public void ReEntercredentials() throws InterruptedException {
	  LandingPage obj1= new LandingPage(driver);
	  obj1.forgotAccount();
	  Thread.sleep(4);
	  ForgotPassPage obj2= new ForgotPassPage(driver);
	 // obj2.enterEmailAgain("none");
	  Thread.sleep(5);
	  obj2.disregard();
	  //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	  
//	  wait.until(ExpectedConditions.visibilityOf(obj2.));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  driver.navigate().to("http://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  
  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
