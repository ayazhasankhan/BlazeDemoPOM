package interfaceDemo;

public class Honda implements Bike{
	
	@Override
	public void stop() {
		System.out.println("Stoping");	
	}
	
	@Override
	public void run() {
		System.out.println("Running");
		
	}

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		obj.run();
		//obj.start();
		obj.stop();
	}





}
