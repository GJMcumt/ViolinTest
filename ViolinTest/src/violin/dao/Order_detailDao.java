package violin.dao;

import org.apache.ibatis.annotations.Delete;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;


import static violin.util.common.Constants.ODTABLE;
import static violin.util.common.Constants.ORDERTABLE;
import java.util.List;

import violin.domain.Order_detail;


import violin.dynaSqlProvider.Order_detailDynaSqlProvider;

public interface Order_detailDao {
	//查出订单详情里的信息
	@Select("select * from "+ODTABLE+" ")
	List<Order_detail> selectOrder_detail();
//动态插入
		@SelectProvider(type=Order_detailDynaSqlProvider.class,method="insertOD")
		void saveOrder_detail(Order_detail order_detail);
//根据goods_sn 查找出订单编号
		@Select("select order_sn from "+ODTABLE+" where goods_sn=#{goods_sn}")
		String seleceOrder_sn(String goods_sn);
//根据goods_sn查询订单
		@Select("select * from "+ODTABLE+" where goods_sn=#{goods_sn}")
		List<Order_detail> selectODByGoods_sn(String goods_sn);
//把添加购买数量,动态更新
		@SelectProvider(type=Order_detailDynaSqlProvider.class,method="updateOD")
		void update(Order_detail order_detail);
//加入购物车
		@SelectProvider(type=Order_detailDynaSqlProvider.class,method="insertCart")
		void saveCart(Order_detail order_detail);
//找出购物车里的信息
		@Select("select * from "+ODTABLE+" where order_sn is null")
		List<Order_detail> selectCart();
//根据Goods_sn删除购物车里的信息
		@Delete("delete from "+ODTABLE+" where goods_sn=#{goods_sn} and order_sn is null")
		void deleteCartByGoods_sn(String goods_sn);
//找出订单编号不为空的商品
		@Select("select * from "+ODTABLE+" where order_sn is not null")
		List<Order_detail> selectOrderByOrder_sn();
//找出未付款的商品
		@Select("select * from "+ODTABLE+" od and "+ORDERTABLE+" or  where od.order_sn=or.order_sn and or.order_status=0")
		List<Order_detail> selectOs0();
		//根据订单编号，找出商品
			@Select("select * from "+ODTABLE+" where order_sn=#{order_sn}")
			Order_detail selectOrderByOs(String order_sn);
}
