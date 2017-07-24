package violin.domain;



public class Goods implements java.io.Serializable {
	private Integer id;
	private String goods_sn;
	private String goods_name;

//	//商品和种类是多对一的关系，多个商品属于一个种类
	private Integer type;
	private Double price;
	private String describe;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private Integer goods_status;
	private Integer inventory;


	public Goods(){
		super();
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoods_sn() {
		return goods_sn;
	}
	public void setGoods_sn(String goods_sn) {
		this.goods_sn = goods_sn;
	}
	public Integer getGoods_status() {
		return goods_status;
	}

	public void setGoods_status(Integer goods_status) {
		this.goods_status = goods_status;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
	return "Goods [id=" + id + ", goods_sn=" + goods_sn + ","
			+ " goods_name=" + goods_name+", type=" + type+", price=" + price+", describe=" + describe+", image1=" + image1+", image2=" + image2+", image3=" + image3+", image4=" + image4+", goods_status=" + goods_status+", inventory=" + inventory+"]";
	}

	

}
