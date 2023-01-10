package myPackage1;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		/*switch(expression)
		 *case value1;
		 *sample code
		 *break;
		 *case value2;
		 *sample code
		 *break;
		 * 
		 * .....
		 * ......
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Default:
		 * code to be executed if all cases are not matched
		 */

		
		int x=5; // variable declaration
		switch(x) { // switch expression
		
		case 10:System.out.println("Number is"+x); // case statement
		break;
		case 20:System.out.println("Number is"+x);
		break;
		case 30:System.out.println("Number is"+x);
		break;
		default:System.out.println("Number in 10,20 or 30"); // default case statement
		}
	}

}
