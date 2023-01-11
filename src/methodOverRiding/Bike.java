package methodOverRiding;

public class Bike extends Vehicle {

	
   public void run() {
		
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		
		Bike obj =new Bike();
		obj.run();

	}

}
