package interfaceDemo;

public interface Bike {
	
	public void run();
	
	public abstract void stop();
	
	public static void start() {
		
		System.out.println("Starting");
		
	}
    @SuppressWarnings("unused")
	private void privateMethod() {
		
		System.out.println("Private Method");
		
	}
	

}
