package design.patterns.strategy;

public class Zhaoyun {
	public static void main(String[] args) {
		Content content = new Content(new BackDoor());
		content.operate();
		
		content = new Content(new GreenRoad());
		content.operate();
		
		content = new Content(new Stealth());
		content.operate();
		
	}

}
