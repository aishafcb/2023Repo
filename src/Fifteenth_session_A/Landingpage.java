package Fifteenth_session_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	WebDriver driver;
	
/*Create a class for amazon home page,then click on the Try Prime link, create a class for that page
 * then click on Try Prime button, create sign in page class and then verify error message displays using assert
 */

	@FindBy(partialLinkText = "Prime")
	WebElement primelink;
	
	//Page factory constructor
	
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods:
	public void clicklink() {
		primelink.click();
	}
}
