package myPackage1;

public class MultipleIfElse {

	public static void main(String[] args) {
		
		String city ="Newyork";
		String State ="British Columbia";
		
		if(city =="Vancouver" && State =="British Columbia") {
			
			if(State =="British Columbia") {
				
				System.out.println("City is Vancouver");
				System.out.println("State is British Columbia");
			}	
		}
		
		else if(city =="Newyork") {
			
			System.out.println("City is Newyork");
		}
		
		else if(city =="London") {
			
			System.out.println("City is London");
		}
		
		else {
			System.out.println("City is" +city);
			
		}

	}

}
