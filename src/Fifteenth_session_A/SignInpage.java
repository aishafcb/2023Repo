package Fifteenth_session_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpage {
WebDriver driver;

@FindBy(id ="signInSubmit")
WebElement button;


//@FindBy(className = " Enter your email or mobile phone number")
//WebElement Errormsg;

//constructor
public SignInpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}

public void signin() {
	button.click();
}

//public String error() {
//	String a=System.out.println(Errormsg.getText());
//	return a;
//}
}
