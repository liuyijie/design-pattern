package design.pattern.template;

public abstract class HummerModel {
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void enginBoom();
	
	final public void run(){
		this.start();
		
		this.enginBoom();
		
		if (this.isAlarm()){
			this.alarm();
		}
		
		this.stop();
	}
	
	protected boolean isAlarm(){
		return true;
	}
}
