package exceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		
		
		
		
		try {

			int b= 20/0; // java.lang.ArithmeticException: / by zero
			System.out.println(b);
		}
		catch(Throwable e) {
			
			System.out.println(e);
		}
       finally{
    	   
    	   int a=2;
    	   int b=3;
    	   int c=a+b;
    	   System.out.println(c);
       }

		System.out.println("Hello");
		System.out.println("Ayaz");
		

	}

}
