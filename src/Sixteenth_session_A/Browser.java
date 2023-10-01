package Sixteenth_session_A;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;

public class Browser {
	public WebDriver driver;

  
  @BeforeClass
  @Parameters ({"url", "browser"})
  public void beforeClass (String url, String browser){
	//open browser  
	  if (browser.equalsIgnoreCase("CHROME")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  driver.navigate().to(url);
	  } else if (browser.equalsIgnoreCase("FIREFOX")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\aisha\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	  FirefoxOptions opt2= new FirefoxOptions();
	  driver= new FirefoxDriver();
	  driver.navigate().to(url);
	  } else {
		  System.out.println("check your .xml file");
	  }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
  }

  @AfterClass
  public void afterClass() {
  }
  public void screenshots()throws IOException {
  
	  //screenshot code
	  File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(pic, new File("C:\\Users\\aisha\\Documents\\screenshots\\photo.png"));
	 
  }

}
