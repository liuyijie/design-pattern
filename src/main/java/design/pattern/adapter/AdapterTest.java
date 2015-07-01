package design.pattern.adapter;

import java.util.HashMap;

public class AdapterTest {
	public static void main(String[] args) {
		HashMap<String, String> numberinfo = new HashMap<String, String>();
		numberinfo.put("number", "1312312");
		HashMap<String, String> baseinfo = new HashMap<String, String>();
		baseinfo.put("userName", "zhao yun");
		HashMap<String, String> Homeinfo = new HashMap<String, String>();
		Homeinfo.put("address", "beijing");
		IUserInfo yougirl = new OuterUserInfo(new OuterUser(baseinfo, numberinfo, Homeinfo));
		for(int i=0; i< 101; i++){
			System.out.println( yougirl.getName()+", "+yougirl.getHomeAddress()+", "+yougirl.getMobileNumber());
		}
	}
}
