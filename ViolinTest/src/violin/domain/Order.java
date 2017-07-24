package violin.domain;

import java.sql.Date;

public class Order implements java.io.Serializable {
	private Integer id;
	private String order_sn;
	private Integer user_id;
	private Integer order_status;
	private String address;
//	private Integer buy_count;
	private String order_datetime;






	public Order(){
		super();
	}
	
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Integer getUser_id() {
			return user_id;
		}
		public void setUser_id(Integer user_id) {
			this.user_id = user_id;
		}

	
		public String getOrder_sn() {
			return order_sn;
		}
		public void setOrder_sn(String order_sn) {
			this.order_sn = order_sn;
		}

		public Integer getOrder_status() {
			return order_status;
		}
		public void setOrder_status(Integer order_status) {
			this.order_status = order_status;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}


//		public Integer getBuy_count() {
//			return buy_count;
//		}
//
//		public void setBuy_count(Integer buy_count) {
//			this.buy_count = buy_count;
//		}
		public String getOrder_datetime() {
			return order_datetime;
		}

		public void setOrder_datetime(String order_datetime) {
			this.order_datetime = order_datetime;
		}
		@Override
		public String toString() {
			return "Order [id=" + id + ", order_sn=" + order_sn + ",user_id=" + user_id + ", "
					+ "address=" + address + ", order_status=" + order_status + ",  order_datetime=" + order_datetime + "]";
		}

}
