package violin.domain;

public class Order_status {
	private Integer id;
	private String satus;
	
	public Order_status(){
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
	return "Order_status [id=" + id + ", satus=" + satus + "]";
	}
}
