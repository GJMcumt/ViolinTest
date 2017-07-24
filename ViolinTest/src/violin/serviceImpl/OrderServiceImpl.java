package violin.serviceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import violin.dao.OrderDao;
import violin.domain.Order;
import violin.domain.Order_detail;
import violin.service.OrderService;
@Service("orderService")
public class OrderServiceImpl implements OrderService {
	/*
	 * 自动注入持久层Dao对象
	 */
		@Autowired
		private OrderDao orderDao;
	@Override
	public void addOrder(Order order) {
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  DateFormat format1=new SimpleDateFormat("mmssyyyyMMddHH");
		  String time=format.format(date);
		  String order_sn=format1.format(date);
		  order.setOrder_datetime(time);
		  order.setOrder_sn(order_sn);
		  order.setOrder_status(0);
		 orderDao.saveOrder(order);

	}
	@Override
	public List<Order> findAllOrder() {
		// TODO 自动生成的方法存根
		return orderDao.selectOrder();
	}
	

	@Override
	public void modifyOrder(Order order) {
		orderDao.update(order);
		
	}
	@Override
	public void modifyOrder_status() {
		orderDao.updateOrder_status();
		
	}

	@Override
	public void removeOrderByOrder_sn(String order_sn) {
		orderDao.deleteOrder(order_sn);
		
	}
//	@Override
//	public void addOrder_sn(Order order) {
//		//随机生成订单编号
////		int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
////		int r2=(int)(Math.random()*(10));
////		long now = System.currentTimeMillis();//一个13位的时间戳
////		String order_sn =String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);// 订单ID
//		Date date=new Date();
//		  DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
//		  String time=format.format(date);
//		order.setOrder_sn(time);
//		orderDao.updateOrder_sn(order);
//		
//	}
	@Override
	public List<Order> findOs0() {
		// TODO 自动生成的方法存根
		return orderDao.selectOrder0();
	}
	@Override
	public Order findOrderByOrder_sn(String order_sn) {
		return orderDao.selectOrderByOrder_sn(order_sn);
	}
	@Override
	public void modifyOrder_status3() {
		orderDao.updateOrder_status3();
		
	}
	@Override
	public void modifyOrder_status1() {
		orderDao.updateOrder_status1();
		
	}
	


}
