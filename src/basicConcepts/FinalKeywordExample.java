package basicConcepts;

public class FinalKeywordExample {

/*
 
Final: used to restrict the user to do any modification

1. Final variable --> stop value change
2. final method --> stop method Overriding
3. final class --> stop inheritance
	
 */

final int speedLimit =180;

public void run() {
	//speedLimit =200;
	
	System.out.println(speedLimit);
}
	
	public static void main(String[] args) {
		FinalKeywordExample obj = new FinalKeywordExample();
		obj.run();

	}

}
