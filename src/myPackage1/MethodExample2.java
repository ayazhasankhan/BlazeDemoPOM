package myPackage1;

public class MethodExample2 {
		
/*
 public static  int sum(int a, int b){
 
 }
 		
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

	public static void main(String[] args) {

		MethodExample2 obj = new MethodExample2(); // creating the object of a class
		obj.addition(3, 5);
		obj.multiplication();
		

	}

}
