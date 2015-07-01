package design.pattern.adapter;

public class OuterUserInfo implements IUserInfo {
	private OuterUser outerUser;
	public OuterUserInfo(OuterUser outerUser) {
		this.outerUser = outerUser;
	}

	@Override
	public String getName() {
		return outerUser.getUserBaseInfo().get("userName");
	}

	@Override
	public String getMobileNumber() {
		return outerUser.getUserNumberInfo().get("number");
	}

	@Override
	public String getHomeAddress() {
		return outerUser.getUserHomeInfo().get("address");
	}

}
