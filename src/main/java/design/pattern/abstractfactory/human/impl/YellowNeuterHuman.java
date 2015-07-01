package design.pattern.abstractfactory.human.impl;

import design.pattern.abstractfactory.human.AbstractYellowHuman;

public class YellowNeuterHuman extends AbstractYellowHuman {
	public void sex(){
		System.out.println("Yellow neuter");
	}
}
