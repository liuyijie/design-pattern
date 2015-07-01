package design.pattern.interceptingfilter;

public class AddressFilter extends AbstractFilter {
	@Override
	public String execute(Order order) {
		System.out.println(this.getClass().getSimpleName());
		String result = super.execute(order);
		if (order.getAddress() == null || order.getAddress().isEmpty()){
			return result +"Invalid address! ";
		}else{
			return result;
		}
	}

}
