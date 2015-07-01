package design.pattern.interceptingfilter;

public class NameFilter extends AbstractFilter {
	@Override
	public String execute(Order order) {
		System.out.println(this.getClass().getSimpleName());
		String result = super.execute(order);
		if (order.getName() == null || order.getName().length() == 0){
			return result +"Invalid name ! ";
		}else{
			return result;
		}
	}

}
