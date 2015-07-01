package design.pattern.abstractfactory.human;

import design.pattern.abstractfactory.inter.Human;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("yellow laugh!");
	}

	@Override
	public void cry() {
		System.out.println("yellow cry!");
	}

	@Override
	public void talk() {
		System.out.println("yellow talk!");
	}

	@Override
	public void sex() {
		System.out.println("yellow sex!");
	}

}
