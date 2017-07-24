package violin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import violin.dao.Order_detailDao;
import violin.domain.Order;
import violin.domain.Order_detail;
import violin.service.Order_detailService;

@Service("order_detailService")
public class Order_detailServiceImpl implements Order_detailService {
	/*
	 * 自动注入持久层Dao对象
	 */
		@Autowired
		private Order_detailDao order_detailDao;
	@Override
	public void addOrder_detail(Order_detail order_detail,Order order) {
//		Date date=new Date();
//		  DateFormat format=new SimpleDateFormat("mmyyyyMMddHH");
//		  String time=format.format(date);
		String order_sn=order.getOrder_sn();
		  order_detail.setOrder_sn(order_sn);
		order_detailDao.saveOrder_detail(order_detail);


		
	}
	@Override
	public String findOrder_sn(String goods_sn) {
		return order_detailDao.seleceOrder_sn(goods_sn);
		
	}
	@Override
	public List<Order_detail> findODByGoods_sn(String goods_sn) {
		// TODO Auto-generated method stub
		return order_detailDao.selectODByGoods_sn(goods_sn);
	}
	@Override
	public void modifyBuy_count(Order_detail order_detail) {
		order_detailDao.update(order_detail);
		
	}
	@Override
	public List<Order_detail> findAllOrder_detail() {
		// TODO Auto-generated method stub
		return order_detailDao.selectOrder_detail();
	}
	@Override
	public void addCart(Order_detail order_detail) {
		order_detailDao.saveCart(order_detail);
		
	}
	@Override
	public List<Order_detail> findCart() {
//		// TODO 自动生成的方法存根
//		String order_sn=null;
//		order_detail.setOrder_sn(order_sn);
		return order_detailDao.selectCart();
	}
	@Override
	public void removeCartByGoods_sn(String goods_sn) {
		order_detailDao.deleteCartByGoods_sn(goods_sn);
		
	}
	@Override
	public List<Order_detail> findOrderByOrder_sn() {
//		String order_sn=order.getOrder_sn();
//		order_detail.setOrder_sn(order_sn);
		return order_detailDao.selectOrderByOrder_sn();
	}
	@Override
	public List<Order_detail> findOs0() {
		return order_detailDao.selectOs0();
	}
	@Override
	public Order_detail findOrderByOs(String order_sn) {
		return order_detailDao.selectOrderByOs(order_sn);
	}




}
