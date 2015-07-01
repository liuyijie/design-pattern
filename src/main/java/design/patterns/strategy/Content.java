package design.patterns.strategy;

public class Content {
	private IStrategy iStrategy;
	
	public Content(IStrategy iStrategy){
		this.iStrategy = iStrategy;
	}
	
	public void operate(){
		this.iStrategy.operate();
	}
	
}
