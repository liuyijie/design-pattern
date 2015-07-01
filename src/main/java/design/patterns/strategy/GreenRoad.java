package design.patterns.strategy;

public class GreenRoad implements IStrategy {

	@Override
	public void operate() {
		System.out.println("开路灯-------------");
	}

}
