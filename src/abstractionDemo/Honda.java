package abstractionDemo;

public class Honda extends Bike{
	
	@Override
	public void stop() {
		System.out.println("Stoping");	
	}

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		//obj.run();
		//obj.start();
		obj.stop();
	}



}
