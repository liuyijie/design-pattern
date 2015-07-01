package design.patterns.proxy;

public class XiManQing {
	public static void main(String[] args) {
		WangPo wangpo = new WangPo();
		wangpo.paoMeiYan();
		wangpo.happyWithMan();
		
		wangpo = new WangPo(new JiaShi());
		wangpo.paoMeiYan();
		wangpo.happyWithMan();
		
	}
}
