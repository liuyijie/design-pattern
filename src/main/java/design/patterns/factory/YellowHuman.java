package design.patterns.factory;

public class YellowHuman implements Human {

	@Override
	public void launch() {
		System.out.println("I am yellow human!");
	}

	@Override
	public void eat() {
		System.out.println("I can eat!");
	}

}
