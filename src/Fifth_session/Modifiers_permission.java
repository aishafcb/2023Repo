package Fifth_session;

import org.openqa.selenium.chrome.ChromeDriver;

public class Modifiers_permission {

	//create two global variables:
	static int length=10;
	static int width=20;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(length);
          
           
	}

	public  void area() {
		//int length=50;           //you can have two exact variable names in a class as long as they are not within the same method. In this case one is global and one is local.
		int areaofsquare=length*width;
		System.out.println(areaofsquare);
	}

	 public void circle() {
		 int areacircle=length+width;
		 System.out.println(areacircle);
	 }
	
	
}
