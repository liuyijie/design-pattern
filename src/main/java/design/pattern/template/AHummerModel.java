package design.pattern.template;

public class AHummerModel extends HummerModel {

	@Override
	protected void start() {
		System.out.println("A HummerModel start");
	}

	@Override
	protected void stop() {
		System.out.println("A HummerModel stop");
	}

	@Override
	protected void alarm() {
		System.out.println("A HummerModel alarm");
	}

	@Override
	protected void enginBoom() {
		System.out.println("A HummerModel engin");
	}
	
	@Override
	protected boolean isAlarm() {
		return true;
	}

}
