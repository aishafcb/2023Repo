package Sixteenth_session_C;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Sixteenth_session_A.Browser;
import Sixteenth_session_B.Pages;

public class RunCode extends Browser{
	//WebDriver driver;
  @Test
  public void f() {
	  //execution code
 
	Pages obj1= new Pages(driver);
	obj1.enterEmail("aisha222@gmail.com");
	obj1.enterPwd("12345");
	obj1.Enter();
	  
  }
}
