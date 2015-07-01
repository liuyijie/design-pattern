package design.patterns.strategy;

public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("开后门-------------");
	}

}
