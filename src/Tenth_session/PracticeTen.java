package Tenth_session;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
//Create testNG class and do the following script 1)open chrome browser 2)open FB 3) Enter email 4)enter pwd 5) 
//click login button 6)go back 7)click on forget pwd 8)enter email again
/*
 * ID  linkText  partialLinkText   Xpath(basic; text,contains, starts-with) Name  Classname
 * xPath can use all attributes even those that are not the 8 locators
 *                   //tagname[@attribute='value']
 */
public class PracticeTen {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  //enter email, pwd and click log in button:
	  WebElement email=driver.findElement(By.id("email"));      //by ID
	  //Thread.sleep(2000);
	  //WebElement email=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div)[1]"));   //using absolute Xpath
	  //email.click();
	  email.sendKeys("abc@hotmail.com");
	  //WebElement pwd=driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));  //by Class
	  WebElement pwd=driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy _9npi']"));
	  pwd.sendKeys("12345");
	  WebElement button=driver.findElement(By.xpath("//*[contains(@id, 'u_0_5')]"));  //by Contains Method
	  button.click();
	  driver.navigate().back();
	  Thread.sleep(3000);
	  //forget pwd and email again:
	  WebElement forgot=driver.findElement(By.xpath("//*[text()='Forgot password?']"));   //by Text Method
	  forgot.click();
	  Thread.sleep(3000);
	  WebElement email2=driver.findElement(By.xpath("//*[@type='text']"));
	  email2.clear();
	  email2.sendKeys("123@gmail.com");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aisha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(opt);
	  driver.get("http://www.facebook.com");
	  
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
