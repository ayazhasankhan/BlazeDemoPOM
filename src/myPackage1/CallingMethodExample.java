package myPackage1;

public class CallingMethodExample {
	
	
/*
 public static  int sum(int a, int b){
 
 }
 	
 	
 	
 	
 */
	
	
	int x=7;
	int y=8; 
	int sum;
	int mul;
	
	public void addition() {
		
		sum =x+y;
		System.out.println(sum);
	}
	
	void multiplication() {
		
		mul=x*y;
		System.out.println(mul);	
	}

	public static void main(String[] args) {
		
	/*
	 * 	int a=2; // a local
	 * 	int b=3; // b is local
		int sum =a+b; // sum is local variable
		System.out.println(sum);
	 */

		CallingMethodExample obj = new CallingMethodExample(); // creating the object of a class
		obj.addition(); // calling the function 
		obj.multiplication();
		

	}

}
