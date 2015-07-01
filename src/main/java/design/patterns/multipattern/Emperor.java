package design.patterns.multipattern;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	private Emperor(String name) {
		emperorInfoList.add(name);
	}

	private static int maxNumOfEmperor = 2;
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxNumOfEmperor);
	private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxNumOfEmperor);
	private static int countNNumOfEmperor = 0;
	
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor("皇"+(i+1)+"帝"));
		}
	}
	
	public static Emperor getInstance(){
		Random random = new Random();
		countNNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNNumOfEmperor);
	}
	
	public void emperorInfo(){
		System.out.println(emperorInfoList.get(countNNumOfEmperor));
	}
}
