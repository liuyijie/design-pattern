package design.pattern.abstractfactory;

import design.pattern.abstractfactory.enums.HumanEnum;
import design.pattern.abstractfactory.inter.AbstractHumanFactory;
import design.pattern.abstractfactory.inter.Human;

public class MaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

}
