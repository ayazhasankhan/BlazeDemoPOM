package basicConcepts;

public class VariableDemo {
	
	int z=100; //Instance variables
	
	static int f=200; // static variable
	
	
	public void addition() {
		
		int x=7;  // x is local variable
		int y=8; // y is local variable
		System.out.println(z);
		System.out.println(f);
	}
	
	public void multiplication() {
		int p=7;  // p is local variable
		int q=8; // q is local variable
		
		System.out.println(z);
		System.out.println(f);
	}
	
	public static void substraction() {
//		System.out.println(z); // you can not use non static variable inside the static function
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		int a=3;  // created a variable 'a' which is integer type, and assingend the value(3) to that variable.
		int b=2;  // created a variable 'b' which is integer type, and assingend the value(2) to that variable.
		
		// types of variable
		//1.local
		//2. instance variable
		//3. static variable
		
		System.out.println(f);

	}

}
