package Thirteenth_session_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPage {

WebDriver driver;


@FindBy(xpath="//*[@aria-label='Email or mobile number']")
WebElement email2;

@FindBy(linkText="Cancel")
WebElement cancel;


public ForgotPassPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void enterEmailAgain(String emailtwo) {
	email2.sendKeys(emailtwo);
}

public void disregard() {
	cancel.click();
}
}
