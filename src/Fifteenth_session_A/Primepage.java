package Fifteenth_session_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Primepage {
WebDriver driver;

@FindBy(xpath = "//*[@name='CTAtext']")
WebElement Startforfree;

//constructor
public Primepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

//methods:
 
public void clickbutton() {
	Startforfree.click();
}
}
