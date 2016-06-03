
public class SingletonDesignPattern {
	
	
	private static SingletonDesignPattern instance = new SingletonDesignPattern();
	
	private SingletonDesignPattern()
	{
		System.out.println("Creating a singleton design pattern object");
	}

	
	
	public static SingletonDesignPattern createInstance()
	{
		
		return instance;
	}
}
