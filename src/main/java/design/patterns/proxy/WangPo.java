package design.patterns.proxy;

public class WangPo implements KindWomen {

	private KindWomen kindWomen;
	
	public WangPo(){
		kindWomen = new PanJinLian();
	}
	
	public WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}
	
	@Override
	public void paoMeiYan() {
		this.kindWomen.paoMeiYan();
	}

	@Override
	public void happyWithMan() {
		this.kindWomen.happyWithMan();
	}

}
