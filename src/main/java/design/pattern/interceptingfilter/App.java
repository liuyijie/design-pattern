package design.pattern.interceptingfilter;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		FilterManager fm = new FilterManager();
		fm.addFilter(new ContactFilter());
		fm.addFilter(new OrderFilter());
		fm.addFilter(new AddressFilter());
//		fm.addFilter(new NameFilter());
		ArrayList<Order> orders = new ArrayList<Order>(3);
		Order order = new Order();
		order.setOrder("sss");
		order.setName("22");
		order.setContactNumber("31111111111");
		order.setAddress("");
		System.out.println("0"+fm.filterRequest(order));
		
//		order = new Order();
//		order.setOrder("");
//		order.setName("");
//		order.setAddress("222222");
//		order.setContactNumber("33311133333");
//		System.out.println("1"+fm.filterRequest(order));
//
//		FilterManager fm1 = new FilterManager();
//		fm1.addFilter(new ContactFilter());
//		
//		order = new Order();
//		order.setOrder("");
//		order.setName("323");
//		order.setAddress("222222");
//		order.setContactNumber("");
//		System.out.println("2"+fm1.filterRequest(order));
//		
//		orders.forEach(one -> {
//			String t = fm.filterRequest(one);
//			System.out.println("ERROR: "+t);
//		});
		
	}
}
