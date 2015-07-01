package design.patterns.factory;

public class BlackHuman implements Human {

	@Override
	public void launch() {
		System.out.println("I am back human!");
	}

	@Override
	public void eat() {
		System.out.println("I can eat!");
	}

}
