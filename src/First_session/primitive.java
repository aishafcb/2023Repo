package First_session;

/*Data types: Primitive(int,long,float, double,char, string, boolean) and 
 * non-primitive(class, array, interface)
 */

public class primitive {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

//variable declaration: datatype variablename= value
		int a= 10;
		int b=20;
		int c=a+b;
		System.out.println("the value of c is:" + c);

		String name="aisha";
		long d= 700000000L;
		float e= 8.8f;
		double f= 88.8888888;
		boolean g= true;
		
		System.out.println("the value of g is:" + g);

	
/*OPERATORS: arithmetic operators(plus, minus, multiply, divide, modulo)
 *  and logical operators(and, or, not)
 * 		
 */
        int h=10;
        boolean i=(a==b)&&(a==c)&&(a==h);
        System.out.println("expected value=false and actual value is " +i);
        boolean j=(a==b)||(a==c)||(a==h);
        System.out.println("expected value=true and actual value is " +j);

        
        int k=c%a;
        System.out.println("the remainder is "+ k);        
	}
}



