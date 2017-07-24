package violin.domain;

public class Goods_status {
	private Integer id;
	private String satus;
	
	public Goods_status(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	@Override
	public String toString() {
	return "Goods_status [id=" + id + ", satus=" + satus + "]";
	}
}
