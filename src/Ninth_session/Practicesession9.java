package Ninth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Practicesession9 {
	WebDriver driver;
  @Test //this is equivalent to your main method.
  public void f() {
	  System.out.println("this is test annotation");
	  driver.get("http://www.bbc.co.uk");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeclass annotation");
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\aisha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  			EdgeOptions option = new EdgeOptions();
	  			option.addArguments("--remote-allow-origins=*");
	  //this should have browser info
	  //first step is to tell eclipse where your browser is and second is
	  //to create an object so you can interact with it
	   // System.setProperty("wedbdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\aisha\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\aisha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  // the reason i didnt do WebDriver driver= new ChromeDriver(); is because
	  //that driver would have been local to this method and we wouldn't have been 
	  //able to use it in the main F method :)
	  driver= new EdgeDriver(option);
	//driver= new EdgeDriver();
	  //driver.get("http://www.bbc.co.uk");
	
	  
	  
	 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass annotation");
  }

}
