package design.pattern.abstractfactory.human;

import design.pattern.abstractfactory.inter.Human;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("white laugh!");
	}

	@Override
	public void cry() {
		System.out.println("white cry!");
	}

	@Override
	public void talk() {
		System.out.println("white talk!");
	}

	@Override
	public void sex() {
		System.out.println("white sex!");
	}

}
