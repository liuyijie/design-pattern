package design.patterns.singleton;

public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	
	public synchronized static Singleton getSingleton(){
		return singleton;
	}
}
