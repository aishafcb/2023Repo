package Eighth_session;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// parent obj1= new parent();
		child obj1 = new child();
//		obj1.multiplication();
//		parent obj2 = new parent();
//		obj2.addition(); 
obj1.addition();
		//to avoid having to create two objects, you can simply extend
	}
	@Override
	
   public void addition() {
	   int d=10;
	   int e= 10;
	   int f=d *e;
	   System.out.println(f);
   }
}
