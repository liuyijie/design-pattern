package design.patterns.factory;

public class WhiteHuman implements Human {

	@Override
	public void launch() {
		System.out.println("I am white human!");
	}

	@Override
	public void eat() {
		System.out.println("I can eat!");
	}

}
