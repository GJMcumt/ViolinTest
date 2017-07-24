package violin.domain;

public class Collection_detail {
	private Integer id;
	private String collection_sn;
	private String goods_name;
	private String image1;
	
	public Collection_detail(){
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollection_sn() {
		return collection_sn;
	}
	public void setCollection_sn(String collection_sn) {
		this.collection_sn = collection_sn;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	
	@Override
	public String toString() {
	return "Collection_detail [id=" + id + ", collection_sn=" + collection_sn + ", goods_name=" + goods_name + ", image1=" + image1 + "]";
	}
}
