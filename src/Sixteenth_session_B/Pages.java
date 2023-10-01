package Sixteenth_session_B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	WebDriver driver;
	//have all your pages info like elements, page factory, and methods
	@FindBy (id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement button;
	
//create constructor
	
	public Pages (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
//methods:
	public void enterEmail(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterPwd(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void Enter () {
		button.click();
	}

}
