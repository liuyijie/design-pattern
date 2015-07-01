package design.pattern.interceptingfilter;

public class FilterManager {
	
	private FilterChain filterChain;
	
	public FilterManager(){
		filterChain = new FilterChain();
	}
	
	public void addFilter(Filter filter){
		filterChain.addFilter(filter);
	}
	
	public String filterRequest(Order order){
		return filterChain.processFilter(order);
	}
}
