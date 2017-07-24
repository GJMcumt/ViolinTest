package violin.service;

import java.util.List;

import violin.domain.Order;
import violin.domain.Order_detail;

public interface Order_detailService {
	//查出订单详情里的信息
	List<Order_detail> findAllOrder_detail();
	//添加订单详情
	void addOrder_detail(Order_detail order_detail,Order order);

	//根据goods_sn查找出订单编号
	String findOrder_sn(String goods_sn);
	//根据Goods_sn来查询订单
		List<Order_detail> findODByGoods_sn(String goods_sn);
	//修改购买数量
		void modifyBuy_count(Order_detail order_detail);
	//加入购物车
		void addCart(Order_detail order_detail);
	//查找购物车的信息
		List<Order_detail> findCart();
	//根据goods_sn删除购物车里的信息
		void removeCartByGoods_sn(String goods_sn);
	//找出订单编号不为空的商品
		List<Order_detail> findOrderByOrder_sn();
	//找出未付款的订单
		List<Order_detail> findOs0();
	//根据订单编号，找出商品
		Order_detail findOrderByOs(String order_sn);
}
