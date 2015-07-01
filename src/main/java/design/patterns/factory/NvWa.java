package design.patterns.factory;

import java.util.ArrayList;

public class NvWa {
	public static void main(String[] args) {
		Human whuman = HumanFactory.createHuman(WhiteHuman.class);
		Human bHuman = HumanFactory.createHuman(BlackHuman.class);
		Human yHuman = HumanFactory.createHuman(YellowHuman.class);
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(yHuman);
		list.add(bHuman);
		list.add(whuman);
		for(Human human: list){
			human.launch();
		}
		
		for(int i=0; i< 1000; i++){
			Human human = HumanFactory.createHuman();
			human.launch();
		}
	}
}
