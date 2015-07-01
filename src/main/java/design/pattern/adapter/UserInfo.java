package design.pattern.adapter;

public class UserInfo implements IUserInfo {

	@Override
	public String getName() {
		System.out.println("name is hello");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("number is 11111");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("address is beijing");
		return null;
	}

}
