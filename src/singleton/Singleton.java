package singleton;

public class Singleton {
	
	private static Singleton instance;
	private String value;
	
	private Singleton(String value) {
		
		try {
			
			this.value = value;
			
			System.out.println("the first instance is created");
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	}
	
	public static Singleton getInstance(String value) {
		
		if(instance == null) {
			
			
			instance = new Singleton(value);
			
		}
		
		return instance;
			
	}
	
	public String getValue() {
		
		return this.value;
		
	}
}
