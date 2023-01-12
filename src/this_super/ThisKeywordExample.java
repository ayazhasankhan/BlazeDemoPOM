package this_super;

public class ThisKeywordExample {

	
/*
 
 This Keyword: It is a reference variable that refers to the current object.	
 
 Use of This:
 
 1. This can be used to refer current class instance variable.
 2. This can be used to invoke current class method.
 3. This can be used to invoke current class constructor.
 4. This can be passed as an arg in the method call.
 5. This can be passed as an arg in the constructor call.
 6. this can be used to return the current class instance from the method
 */
	
/*	
	 Super Keyword: It is a reference variable that refers to the PARENT class object.	
	 
	 Use of This:
	 
	 1. Super can be used to refer Parent class instance variable.
	 2. Super can be used to invoke Parent class method.
	 3. Super can be used to invoke Parent class constructor.
	 */
	
	void run() {
		
	System.out.println("Running");	
	}
	void walk() {
		
		//System.out.println("Walking");
		this.run();
	}
	
	
}
