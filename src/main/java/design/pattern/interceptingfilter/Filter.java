package design.pattern.interceptingfilter;

public interface Filter {
	/**
	 * Execute order processing filter.
	 * @param order
	 * @return empty string on success, otherwise error message.
	 */
	String execute(Order order);
	
	/**
	 * Set next filter in chain after this.
	 * @param filter
	 */
	void setNext(Filter filter);
	
	/**
	 * Get next filter in chain after this
	 * @return
	 */
	Filter getNext();
	
	/**
	 * Get last filter in chain after this.
	 * @return
	 */
	Filter getLast();
	
}
