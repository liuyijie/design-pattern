package design.pattern.adapter;

import java.util.Map;

public interface IOuterUser {
	public Map<String, String> getUserBaseInfo();
	
	public Map<String, String> getUserNumberInfo();
	
	public Map<String, String> getUserHomeInfo();
}
