package Sixteenth_session_D;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Sixteenth_session_A.Browser;

public class ListnerCode extends Browser implements ITestListener {
	WebDriver driver;

	//listen code implementation
	public void onTestSuccess(ITestResult result) {
		try{
			screenshots();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public void onTestFailure(ITestResult result) {
		try{
			screenshots();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
