package myPackage1;

public class AceessModifierExample {
	
/*
 
 Access Modifier: 
 1. Private
 2. Default
 3. Protected
 4. Public
 	
These modifier can be applied on variable, method, constructor and class
 	 	
 */
	
	private static int x=7;
	static int y=8; 
	private int sum;
	private int mul;
	
	private void addition() {
		
		sum =x+y;
		System.out.println(sum);
	}
	
	void multiplication() {
		
		mul=x*y;
		System.out.println(mul);	
	}



}
