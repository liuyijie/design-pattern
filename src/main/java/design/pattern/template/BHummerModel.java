package design.pattern.template;

public class BHummerModel extends HummerModel {

	@Override
	protected void start() {
		System.out.println("B HummerModel start");
	}

	@Override
	protected void stop() {
		System.out.println("B HummerModel stop");
	}

	@Override
	protected void alarm() {
		System.out.println("B HummerModel alarm");
	}

	@Override
	protected void enginBoom() {
		System.out.println("B HummerModel engin");
	}
	
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
