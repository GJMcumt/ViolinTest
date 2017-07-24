package violin.dynaSqlProvider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import violin.domain.Goods;

import static violin.util.common.Constants.GOODSTABLE;

public class GoodsDynaSqlProvider {
	//动态查询
	public String selectWithParam(Map<String, Object>params){
		String sql = new SQL(){
			{
				SELECT("*");
				FROM(GOODSTABLE);
				Goods goods = (Goods)params.get("goods");
				if(goods.getGoods_sn() !=null && !goods.getGoods_sn().equals("")){
					WHERE("goods_name LIKE CONCAT('%',#{goods_name},'%')");
				}				
			}
		}.toString();
		return sql;
	}
	//动态插入
	public String insertGoods(Goods goods){
		return new SQL(){
			{
				INSERT_INTO(GOODSTABLE);
				if(goods.getGoods_name() !=null ){
					VALUES("goods_name","#{goods_name}");
				}
				if(goods.getGoods_sn() !=null ){
					VALUES("goods_sn","#{goods_sn}");
				}
				if(goods.getType() != null){
					VALUES("type","#{type}");
				}
				if(goods.getPrice() !=null){
					VALUES("price","#{price}");
				}
				if(goods.getDescribe() !=null){
					VALUES("`describe`","#{describe}");
				}
				if(goods.getImage1() !=null ){
					VALUES("image1","#{image1}");
				}
				if(goods.getImage2() !=null ){
					VALUES("image2","#{image2}");
				}
				if(goods.getImage3() !=null ){
					VALUES("image3","#{image3}");
				}
				if(goods.getImage4() !=null ){
					VALUES("image4","#{image4}");
				}
				if(goods.getGoods_status() !=null ){
					VALUES("goods_status","#{goods_status}");
				}
				if(goods.getInventory() !=null ){
					VALUES("inventory","#{inventory}");
				}				
			}
		}.toString();
	}
	//动态更新
	public String updateGoods(Goods goods){
		return new SQL(){
			{
				UPDATE(GOODSTABLE);
				if(goods.getGoods_name() !=null){
					SET("goods_name=#{goods_name}");
				}
				if(goods.getType()!=null){
					SET("type=#{type}");
				}
				if(goods.getPrice()!=null){
					SET("price=#{price}");
				} 
				if(goods.getDescribe()!=null){
					SET("`describe`=#{describe}");
				}
				if(goods.getImage1() !=null ){
					SET("image1=#{image1}");
				}
				if(goods.getImage2() !=null ){
					SET("image2=#{image2}");
				}
				if(goods.getImage3() !=null ){
					SET("image3=#{image3}");
				}
				if(goods.getImage4() !=null ){
					SET("image4=#{image4}");
				}	
				if(goods.getGoods_status() !=null ){
					SET("goods_status=#{goods_status}");
				}
				if(goods.getInventory() !=null ){
					SET("inventory=#{inventory}");
				}	
				WHERE("goods_sn=#{goods_sn}");
			}
		}.toString();
	}

}
