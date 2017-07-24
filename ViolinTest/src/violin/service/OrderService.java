package violin.service;

import java.util.List;

import violin.domain.Order;
import violin.domain.Order_detail;

public interface OrderService {
//添加订单数据
	void addOrder(Order order);
//查询订单
	List<Order> findAllOrder();
//动态更新
	void modifyOrder(Order order);
	
//更新订单状态
	void modifyOrder_status();
	void modifyOrder_status3();
	void modifyOrder_status1();
//根据订单编号删除订单里的信息
	void removeOrderByOrder_sn(String order_sn);
////添加订单编号
//	void addOrder_sn(Order order);
//查询order_status=0的订单信息
	List<Order> findOs0();
//根据订单编号查询订单信息
	Order findOrderByOrder_sn(String order_sn);
}
