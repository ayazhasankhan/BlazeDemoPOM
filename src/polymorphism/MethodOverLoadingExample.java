package polymorphism;

public class MethodOverLoadingExample {
	
/* MethodOverLoading: If a class has multiple methods having same name but different in parameters , is known as method overloading.
                      Overloading happens in same class.
   Advantage: reduce the code and increased the code readability
   
   Ways: 
   1. By changing number of arguments
   2. By changing the data type
 
 */
	double area;
	
	public void area(int lenth) {
		
		area =lenth*lenth;
		System.out.println("Area of square "+ area);
	}
	
	public void area(int lenth, int hight) {
		
		area =lenth*hight;
		System.out.println("Area of rectange "+ area);
	}
	
	public void area(int lenth, double breath) {
		
		area =.5*lenth*breath;
		System.out.println("Area of triangle "+ area);
	}
	public static void main(String[] args) {
		
		MethodOverLoadingExample obj =new MethodOverLoadingExample();
		obj.area(2,6.6);
		

	}

}
