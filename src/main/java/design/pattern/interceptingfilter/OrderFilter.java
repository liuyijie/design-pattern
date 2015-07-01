package design.pattern.interceptingfilter;

public class OrderFilter extends AbstractFilter {
	@Override
	public String execute(Order order) {
		System.out.println(this.getClass().getSimpleName());
		String result = super.execute(order);
		if (order.getOrder() == null || order.getOrder().length() == 0){
			return result +"Invalid getOrder ! ";
		}else{
			return result;
		}
	}

}
