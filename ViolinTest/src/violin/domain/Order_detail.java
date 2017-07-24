package violin.domain;

import java.sql.Date;

public class Order_detail {
	private Integer id;
	private String order_sn;
	private String goods_sn;
	private String goods_name;

	private Double price;
	private Integer buy_count;
	private String image1;

	

	public Order_detail(){
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrder_sn() {
		return order_sn;
	}
	public void setOrder_sn(String order_sn) {
		this.order_sn = order_sn;
	}
	public String getGoods_sn() {
		return goods_sn;
	}
	public void setGoods_sn(String goods_sn) {
		this.goods_sn = goods_sn;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getBuy_count() {
		return buy_count;
	}
	public void setBuy_count(Integer buy_count) {
		this.buy_count = buy_count;
	}
//	public Date getOrder_datetime() {
//		return order_datetime;
//	}
//	public void setOrder_datetime(Date order_datetime) {
//		this.order_datetime = order_datetime;
//	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	@Override
	public String toString() {
	return "Goods_datail [id=" + id + ", order_sn=" + order_sn + ", goods_sn=" + goods_sn+", goods_name=" + goods_name + ","
			+ " price=" + price+", buy_count=" + buy_count+", image1=" + image1 + "]";
	}
}
