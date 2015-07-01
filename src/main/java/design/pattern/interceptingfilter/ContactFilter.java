package design.pattern.interceptingfilter;

public class ContactFilter extends AbstractFilter {
	@Override
	public String execute(Order order) {
		System.out.println(this.getClass().getSimpleName());
		String result = super.execute(order);
		if (order.getContactNumber() == null
				|| order.getContactNumber().isEmpty()
				|| order.getContactNumber().matches(".*[^\\d]+.*")
				|| order.getContactNumber().length() != 11) {
			return result + "Invalid contact number! ";
		} else {
			return result;
		}
	}

}
