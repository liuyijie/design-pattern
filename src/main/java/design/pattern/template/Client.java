package design.pattern.template;

public class Client {
	public static void main(String[] args) {
		HummerModel h1 = new AHummerModel();
		h1.run();
		
		HummerModel h2 = new BHummerModel();
		h2.run();
	}
}
