package violin.dynaSqlProvider;


import static violin.util.common.Constants.ODTABLE;


import org.apache.ibatis.jdbc.SQL;

import violin.domain.Order_detail;


public class Order_detailDynaSqlProvider {
	//动态插入
	public String insertOD(Order_detail order_detail){	  
		return new SQL(){
			{
				INSERT_INTO(ODTABLE);

				if(order_detail.getOrder_sn() !=null ){
					VALUES("order_sn","#{order_sn}");
				}
				if(order_detail.getGoods_sn() !=null ){
					VALUES("goods_sn","#{goods_sn}");
				}
				if(order_detail.getGoods_name() !=null ){
					VALUES("goods_name","#{goods_name}");
				}
				if(order_detail.getPrice() !=null ){
					VALUES("price","#{price}");
				}
				if(order_detail.getBuy_count() !=null){
					VALUES("buy_count","#{buy_count}");
				}	
				if(order_detail.getImage1() !=null){
				VALUES("image1","#{image1}");
				
			}

			}
		}.toString();

	}
//动态更新
	public String updateOD(Order_detail order_detail){
		return new SQL(){
			{
				UPDATE(ODTABLE);

				if(order_detail.getBuy_count() !=null){
					SET("buy_count = buy_count+ #{buy_count}");
					WHERE("goods_sn=#{goods_sn}");
				}
			}
		}.toString();
	}

	//动态插入
		public String insertCart(Order_detail order_detail){	  
		return new SQL(){
			{
				INSERT_INTO(ODTABLE);

				if(order_detail.getGoods_sn() !=null ){
					VALUES("goods_sn","#{goods_sn}");
				}
				if(order_detail.getGoods_name() !=null ){
					VALUES("goods_name","#{goods_name}");
				}
				if(order_detail.getPrice() !=null ){
					VALUES("price","#{price}");
				}
				if(order_detail.getBuy_count() !=null){
					VALUES("buy_count","#{buy_count}");
				}	
				if(order_detail.getImage1() !=null){
				VALUES("image1","#{image1}");
				
				}

			}
		}.toString();
	}
}

