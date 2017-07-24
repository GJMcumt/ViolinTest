package violin.domain;


public class Categoery implements java.io.Serializable {
	private int id;
	private String type_name;
	public Categoery(){
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	@Override
	public String toString() {
		return "Categoery [id=" + id + ", type_name=" + type_name + "]";
	}
}
