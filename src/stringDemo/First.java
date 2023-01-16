package stringDemo;

public class First {	
	
	public static void main(String[] args) {
		
		String a ="Hello!"; // it does not create a new instance
		String b =new String("Hello! Ayaz How are you doing today?"); // two object and one reference variable
		
		
       // int c =a.length();
		
		String c =a.toUpperCase();
        
        System.out.println(c);
	}

}
