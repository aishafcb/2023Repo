package Fifteeth_session_B;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Fifteenth_session_A.Landingpage;
import Fifteenth_session_A.Primepage;
import Fifteenth_session_A.SignInpage;

public class ExecClass {
	WebDriver driver;

  @Test(priority =1)
  public void f() {
	  Landingpage obj1= new Landingpage(driver);
	  obj1.clicklink();  
  }
  @Test (priority=2)
  public void FreeTrial() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 Primepage obj2= new Primepage(driver);
	 obj2.clickbutton();
  }
  @Test(priority=3)
  public void errorrhanding() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  SignInpage obj3= new SignInpage(driver);  
	  //driver.switchTo().frame(3);
	  obj3.signin();
	  Thread.sleep(5);
	  String err=driver.findElement(By.className("a-alert-content")).getText();
	  Thread.sleep(10);
	  System.out.println(err);
	  //System.out.println("aisha");
	  //String txt=err.getText();
	  Thread.sleep(5);
	  //System.out.println(txt);
	  //Assert.assertEquals("  Enter your email or mobile phone number", err);
      Thread.sleep(5);
  }
  @BeforeClass
  
  @Parameters ({"url","browser"})
  public void beforeClass(String url, String browser) {
	  if (browser.equalsIgnoreCase("CHROME")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  ChromeOptions opt= new ChromeOptions();
		  opt.addArguments("--remote-allow-origins=*");
		  driver= new ChromeDriver(opt);
		  driver.navigate().to(url);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	  } else if (browser.equalsIgnoreCase("FIREFOX")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\aisha\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		  FirefoxOptions opt= new FirefoxOptions();
		  //opt.addArguments("--remote-allow-origins=*");
		  driver= new FirefoxDriver(opt);
		  driver.navigate().to(url);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  } else {
		  System.out.println("no browser slected");
	  }
	 
	  
  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
