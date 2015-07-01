package design.patterns.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import design.patterns.utils.ClassUtils;

public class HumanFactory {
	private static HashMap<String, Human> humans = new HashMap<String, Human>();
	public static Human createHuman(Class<?> c){
		Human human = null;
		try {
			String name = c.getSimpleName();
			if (humans.containsKey(name)){
				human = humans.get(name);
			}else{
				human = (Human) Class.forName(c.getName()).newInstance();
				humans.put(name, human);
			}
		} catch (InstantiationException e) {
			System.out.println("human type error!");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("human def error!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("human not found!");
			e.printStackTrace();
		}
		return human;
	}
	
	public static Human createHuman(){
		@SuppressWarnings("rawtypes")
		List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);
		Random random = new Random();
		int rand = random.nextInt(concreateHumanList.size());
		return createHuman(concreateHumanList.get(rand));
	}
	
	
}
