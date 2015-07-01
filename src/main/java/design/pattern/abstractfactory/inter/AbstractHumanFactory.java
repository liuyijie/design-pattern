package design.pattern.abstractfactory.inter;

import design.pattern.abstractfactory.enums.HumanEnum;

public abstract class AbstractHumanFactory implements HumanFactory {
	
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		if (!humanEnum.getName().equals("")){
			try {
				human = (Human) Class.forName(humanEnum.getName()).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return human;
	}

}
