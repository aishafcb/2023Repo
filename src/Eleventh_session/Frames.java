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

public class Frames {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  String parent=driver.getWindowHandle();
	  driver.switchTo().frame(0);
	  Thread.sleep(5000);
	  WebElement drag=driver.findElement(By.id("draggable"));
	  WebElement drop=driver.findElement(By.id("droppable"));
	  Actions act= new Actions(driver);
	  act.dragAndDrop(drag, drop).perform();
	
	  driver.switchTo().window(parent);
	  WebElement draggable=driver.findElement(By.linkText("Draggable"));
	  draggable.click();
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  driver.navigate().to("https://jqueryui.com/droppable/");
	  //driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
