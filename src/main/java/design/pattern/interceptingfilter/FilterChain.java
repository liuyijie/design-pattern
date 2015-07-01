package design.pattern.interceptingfilter;

import java.util.Iterator;
import java.util.Vector;


public class FilterChain {
  // filter chain 
  private Vector<Filter> myFilters = new Vector<Filter>();

  // Creates new FilterChain 
  public FilterChain()  {
    // plug-in default filter services for example 
    // only. This would typically be done in the 
    // FilterManager, but is done here for example 
    // purposes
//    addFilter(new DebugFilter());
//    addFilter(new LoginFilter());
//    addFilter(new AuditFilter());
  }

  public String processFilter(Order order){
    Filter filter;
    String resultStr = "";
    Iterator<Filter> filters = myFilters.iterator();
    while (filters.hasNext())
    {
      filter = (Filter)filters.next();
      resultStr = filter.execute(order);
      if (resultStr.length() > 0){
    	  break;
      }
    }
    return resultStr;
  }

  public void addFilter(Filter filter)  {
    myFilters.add(filter);
  }
}