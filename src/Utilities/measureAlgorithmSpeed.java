package Utilities;

public class measureAlgorithmSpeed {
		
	private long time;
	
	public void start(){
		time = System.currentTimeMillis();
	}
	
	public void stop(){
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
	
}
