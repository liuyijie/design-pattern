package design.pattern.interceptingfilter;


public class AbstractFilter implements Filter {
	
	private Filter next;
	
	public AbstractFilter() {
		
	}
	
	public AbstractFilter(Filter next){
		this.next = next;
	}
	
	@Override
	public String execute(Order order) {
		String result = "";
		if (getNext() != null){
			Filter nextfilter = getNext();
			System.out.println(nextfilter+"--------next-----");
			result = nextfilter.execute(order);
		}
		return result;
	}

	@Override
	public void setNext(Filter filter) {
		this.next = filter;
	}

	@Override
	public Filter getNext() {
		return next;
	}

	@Override
	public Filter getLast() {
		Filter last = this;
		if(getNext() != null){
			last = last.getNext();
		};
		System.out.println(last+"--------last-----");
		return last;
	}
}
