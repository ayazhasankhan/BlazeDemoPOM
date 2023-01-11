package myPackage1;

public class StaticExample {
	

	/* Static - is used for memory management. 
	
	Static can be:

	1. Variable
	2. method
	3. nested class 
	 		
	 */
	
	static int x=2;
	static int y=3;
    
    public void sum() {
    	
    	int sum= x+y;
    	System.out.println(sum);
    }
    
    public static void substract() {
    	int subs =y-x;
    	System.out.println(subs);
    	
    }
	public static void main(String[] args) {
	
		StaticExample obj = new StaticExample();  // memory will consume
		obj.sum();
		StaticExample.substract();
		
	}

}
