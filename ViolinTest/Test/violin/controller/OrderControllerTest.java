package violin.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import violin.domain.Order_detail;
import violin.service.OrderService;
import violin.service.Order_detailService;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/applicationContext.xml","classpath*:/springmvc-config.xml"})
public class OrderControllerTest {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	@Autowired
	@Qualifier("order_detailService")
	private Order_detailService order_detailService;
//
//	@Test
//	public void testOrder() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testCart() {
//		fail("尚未实现");
//	}

	@Test
	public void testDelete_cart() {
		order_detailService.removeCartByGoods_sn("123");
	}

	@Test
	public void testMy_cart() {
		List<Order_detail> cart_list =order_detailService.findCart();
		for(Order_detail cart:cart_list){
			if(cart !=null){
			System.out.println(cart);
		}else{
			System.out.println("没有找到商品");
		}
		}
	}


}
