package design.pattern.abstractfactory.human;

import design.pattern.abstractfactory.inter.Human;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("black laugh!");
	}

	@Override
	public void cry() {
		System.out.println("black cry!");
	}

	@Override
	public void talk() {
		System.out.println("black talk!");
	}

	@Override
	public void sex() {
		System.out.println("black sex!");
	}

}
