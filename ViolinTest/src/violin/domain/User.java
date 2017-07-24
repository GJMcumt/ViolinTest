package violin.domain;

import java.io.Serializable;

public class User implements Serializable {
	private Integer id;
	private String user_name;
	private String password;
	private String email;
	private String phone;
	private String address;
	//无参数构造器
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", password="
				+ password + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	

}
