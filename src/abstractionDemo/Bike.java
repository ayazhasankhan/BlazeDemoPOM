package abstractionDemo;

public abstract class Bike {
	
	public final void run() {
		System.out.println("Running");
	}
	
	public abstract void stop();
	
	public static void start() {
		
		System.out.println("Starting");
		
	}
	
	public Bike() {
		System.out.println("This my Bike");
		
	}

}
