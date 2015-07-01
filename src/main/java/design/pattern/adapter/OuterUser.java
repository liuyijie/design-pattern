package design.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
	private HashMap<String, String> baseinfo;
	private HashMap<String, String> numberinfo;
	private HashMap<String, String> Homeinfo;
	
	public OuterUser(HashMap<String, String> baseinfo, 
			HashMap<String, String> numberinfo, 
			HashMap<String, String> Homeinfo){
		this.baseinfo = baseinfo;
		this.Homeinfo = Homeinfo;
		this.numberinfo = numberinfo;
	}
	
	@Override
	public Map<String, String> getUserBaseInfo() {
		return baseinfo;
	}

	@Override
	public Map<String, String> getUserNumberInfo() {
		return numberinfo;
	}

	@Override
	public Map<String, String> getUserHomeInfo() {
		return Homeinfo;
	}

}
