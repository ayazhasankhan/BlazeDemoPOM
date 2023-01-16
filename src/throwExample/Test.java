package throwExample;

public class Test {

	public static void main(String[] args) throws Exception {
        
		
		int x=10;
		
		if(x==10) {
			System.out.println("Number is"+x);
			throw new Exception("Number matched, so stoping the execution");
		}
		
		if(x==20) {
			System.out.println("Number is"+x);
			throw new Exception("Number matched, so stoping the execution");
		}
		
		if(x==30) {
			System.out.println("Number is"+x);
			throw new Exception("Number matched, so stoping the execution");
		}
		else {
			System.out.println("Not in 10,20 or 30");
		}
	}

}
