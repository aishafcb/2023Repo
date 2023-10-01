package Thirteenth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
//verify text and presence of elements
//take screenshots
public class AmazonErrors {
	WebDriver driver;

  @Test
  public void f() throws IOException {
  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("btnSignon"))));
	  WebElement button=driver.findElement(By.name("btnSignon")); 
	  Boolean buttondisplay=button.isDisplayed();
	Assert.assertEquals(true, buttondisplay);
	  button.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  String error=driver.findElement(By.className("ErrorMessage__errorMessageText___G0chy")).getText();
	  Assert.assertEquals("A username must be entered. Please enter your username.",error);
	  //take screenshot and save screenshot
	  File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(photo, new File("C:\\Users\\aisha\\Documents\\screenshots\\photo.png"));

  }
  @BeforeTest
  public void beforeTest() {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(opt);
	driver.navigate().to("http://www.wellsfargo.com");
	driver.manage().window().maximize();


	
  }
  
  @AfterTest
  public void afterTest() {

  }

  //public String timestamp() {
	 // Date date= new Date();
	 // return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
//  }
}
