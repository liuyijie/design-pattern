package design.pattern.abstractfactory;

import design.pattern.abstractfactory.enums.HumanEnum;
import design.pattern.abstractfactory.inter.AbstractHumanFactory;
import design.pattern.abstractfactory.inter.Human;

public class FemaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowFemaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackFemaleHuman);
	}

	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteFemaleHuman);
	}

}
