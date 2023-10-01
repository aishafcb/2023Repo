package Eighth_session;

public class Over extends Abstraction {

	/*Abstract class object creation is not possible
	 * when you extend an abstract class, you have to implement unimplemented
	 * methods.
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over obj3= new Over();
		obj3.addition();

	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("print this");
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

}
