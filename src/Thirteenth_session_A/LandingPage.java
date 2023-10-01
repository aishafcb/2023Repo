package Thirteenth_session_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
WebDriver driver;
	
	//1-Locate elements
@FindBy(id="email")
WebElement username;

@FindBy(name="pass")
WebElement password;

@FindBy(name="login")
WebElement button;

@FindBy(linkText="Forgot password?")
WebElement forgotpwd;

//	2- Create page factory constructor

public LandingPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//3-create methods

public void enterUsername(String name) {
	username.sendKeys(name);
}

public void enterPwd(String pwd) {
	password.sendKeys(pwd);
}

public void clickLogin() {
	button.click();
}

public void forgotAccount() {
	forgotpwd.click();
}

}
