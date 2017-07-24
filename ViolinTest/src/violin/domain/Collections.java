package violin.domain;

public class Collections {
	private Integer id;
	private String collection_sn;
	private Integer user_id;
	
	public Collections(){
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
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
	return "Collections [id=" + id + ", collection_sn=" + collection_sn + ", user_id=" + user_id + "]";
	}
}
