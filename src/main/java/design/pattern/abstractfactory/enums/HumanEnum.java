package design.pattern.abstractfactory.enums;

public enum HumanEnum {
	YellowMaleHuman("design.pattern.abstractfactory.human.impl.YellowMaleHuman"),
	YellowFemaleHuman("design.pattern.abstractfactory.human.impl.YellowFemaleHuman"),
	BlackMaleHuman("design.pattern.abstractfactory.human.impl.BlackMaleHuman"),
	BlackFemaleHuman("design.pattern.abstractfactory.human.impl.BlackFemaleHuman"),
	WhiteMaleHuman("design.pattern.abstractfactory.human.impl.WhiteMaleHuman"),
	WhiteFemaleHuman("design.pattern.abstractfactory.human.impl.WhiteFemaleHuman"),
	WhiteNeuterHuman("design.pattern.abstractfactory.human.impl.WhiteNeuterHuman"),
	YellowNeuterHuman("design.pattern.abstractfactory.human.impl.YellowNeuterHuman"),
	BlackNeuterHuman("design.pattern.abstractfactory.human.impl.BlackNeuterHuman");
	
	private String name = "";
	private HumanEnum(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
