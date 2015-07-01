package design.pattern;

import design.pattern.abstractfactory.FemaleHumanFactory;
import design.pattern.abstractfactory.MaleHumanFactory;
import design.pattern.abstractfactory.NeuterHumanFactory;
import design.pattern.abstractfactory.inter.Human;
import design.pattern.abstractfactory.inter.HumanFactory;


public class NvWa {
	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		HumanFactory femalHumanFactory = new FemaleHumanFactory();
		HumanFactory neuterHumanFactory = new NeuterHumanFactory();
		
		Human maleYeHuman = maleHumanFactory.createYellowHuman();
		Human femaleYeHuman = femalHumanFactory.createYellowHuman();
		Human neuteraYeHuman = neuterHumanFactory.createYellowHuman();
		maleYeHuman.sex();
		femaleYeHuman.sex();
		neuteraYeHuman.sex();
		 
	}
}
