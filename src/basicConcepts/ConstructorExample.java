package basicConcepts;

public class ConstructorExample {
		
/*
special type of method/function which will be called automatically once object of the class is created


Rules: 
1. Constructor name must be same as its class name
2. It should not have no explicit return type
3. It can not be abstract, static, final

 		
 */
	public int addition(int x, int y) {
		
		int sum =x+y;
		System.out.println(sum);
		return sum;
	}
	
	public void multiplication() {
		int a=2;
		int b=3;
		int mul=a*b;
		System.out.println(mul);	
	}
	
	public void substraction() {
		int a=2;
		int b=3;
		int sub=b-a;
		System.out.println(sub);	
	}

	private ConstructorExample() {
		
		System.out.println("Hello Constructor");
		
	}
	
	public static void main(String[] args) {

		ConstructorExample obj = new ConstructorExample(); // creating the object of a class
		obj.addition(3, 5);
	//	obj.multiplication();
	//	obj.substraction();
		

	}

}
