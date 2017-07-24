package violin.dynaSqlProvider;

import org.apache.ibatis.jdbc.SQL;

import violin.domain.Goods;
import violin.domain.Order;

import static violin.util.common.Constants.GOODSTABLE;
import static violin.util.common.Constants.ORDERTABLE;

public class OrderDynaSqlProvider {
//动态插入
	public String insertOrder(Order order){
		
		return new SQL(){
			{
				INSERT_INTO(ORDERTABLE);
				if(order.getUser_id() !=null){
					VALUES("user_id","#{user_id}");
				}

				if(order.getOrder_sn() !=null){
					VALUES("order_sn","#{order_sn}");
				}
				if(order.getAddress() !=null){
					VALUES("address","#{address}");
				}
				if(order.getOrder_status() !=null){
					VALUES("order_status","#{order_status}");
				}

				if(order.getOrder_datetime() !=null ){
				VALUES("order_datetime","#{order_datetime}");
			}



			}
		}.toString();
	}
//动态更新
	public String updateOrder(Order order){
		return new SQL(){
			{
				UPDATE(GOODSTABLE);
				if(order.getOrder_sn() !=null){
					SET("order_sn=#{order_sn}");
				}
//				if(order.getUser_id() !=null){
//					SET("user_id = #{user_id}");
//				}
//				if(order.getGoods_sn() !=null){
//					SET("goods_sn = #{goods_sn}");
//				}
//				if(order.getAddress()!=null){
//					SET("address=#{address}");
//				}
//				if(order.getImage1() !=null){
//					SET("image1 = #{image1}");
//				}
//				if(order.getBuy_count() !=null){
//					SET("buy_count = #{buy_count+1}");
//				}
			}
		}.toString();
	}
	

}
