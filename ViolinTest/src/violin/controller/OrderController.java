package violin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import violin.domain.Order;
import violin.domain.Order_detail;
import violin.service.GoodsService;
import violin.service.OrderService;
import violin.service.Order_detailService;
@Controller
public class OrderController {

	/*
	 * 自动注入持久层OrderService对象
	 */
		@Autowired
		@Qualifier("orderService")
		private OrderService orderService;
		@Autowired
		@Qualifier("goodsService")
		private GoodsService goodsService;
		@Autowired
		@Qualifier("order_detailService")
		private Order_detailService order_detailService;
		/**
		 * 处理buy_order请求
		 */
		@RequestMapping(value="/order")
		public ModelAndView order(@RequestParam("buy_count") Integer buy_count,@RequestParam("goods_sn") String goods_sn, @ModelAttribute Order order,@ModelAttribute Order_detail order_detail,ModelAndView mv){
			if(order_detail.getBuy_count() != null && ! order_detail.getBuy_count().equals("")){
				//购买数量不为空，把订单信息添加到order表和order_detail表里
				orderService.addOrder(order);
				order_detailService.addOrder_detail(order_detail,order);
				goodsService.modifyInventory(buy_count,goods_sn);
				mv.setViewName("redirect:/my_order");				
			}else{
				mv.addObject("message", "请输入购买数量");
				mv.setViewName("forward:/goods-detail");
			}

			return mv;
		}
		/**
		 * 处理cart请求
		 */
		@RequestMapping(value="/cart")
		public ModelAndView cart(@RequestParam("goods_sn") String goods_sn, 
				@ModelAttribute Order order,@ModelAttribute Order_detail order_detail,
				ModelAndView mv,HttpSession session){
//如果购买数量不为空，则可以进行下一步			
			if(order_detail.getBuy_count() != null && ! order_detail.getBuy_count().equals("")){
				// 通过商品的编号查找订单里是否有这个商品
				List<Order_detail> order_detail1 =order_detailService.findODByGoods_sn(goods_sn);
				//订单详情表里已经有这个商品
				if(order_detail1 !=null && !order_detail1.isEmpty()){
					for(Order_detail od:order_detail1){
						if(od.getOrder_sn()==null){						
							Od.i=1;
							//没有订单编号，增加购买数量
							order_detailService.modifyBuy_count(order_detail);
							break;
						}
//						else{
//							//如果有订单编号，那就把商品加入订单详情表里
//							order_detailService.addCart(order_detail);
//
//
//						}	
					}
					if(Od.i==0){
						order_detailService.addCart(order_detail);
					}

				}else{
					//如果订单里没有，那就把商品加入订单详情表里
					order_detailService.addCart(order_detail);
				}


				//查找出购物车的信息
				List<Order_detail> cart_list =order_detailService.findCart();
				mv.addObject("cart_list",cart_list);

				//跳转到goods-cart页面
				mv.setViewName("forward:/goods-cart");
//如果购买数量为空，则提示“请输入购买数量”				
			}else{
				mv.addObject("message", "请输入购买数量");
				mv.setViewName("forward:/goods-detail");
			}

			return mv;	
		}
//删除购物车里的商品
		@RequestMapping(value="/delete_cart")
		public ModelAndView delete_cart(@RequestParam("goods_sn") String goods_sn,ModelAndView mv,@ModelAttribute Order_detail order_detail){
			//根据Goods_sn删除购物车里的信息
			order_detailService.removeCartByGoods_sn(goods_sn);
			//查找出订单详情里购物车的信息
			List<Order_detail> cart_list =order_detailService.findCart();
			mv.addObject("cart_list",cart_list);
			mv.setViewName("forward:/goods-cart");
			return mv;
			
		}
		//购物车
		@RequestMapping(value="my_cart")
		public ModelAndView my_cart(ModelAndView mv){
			List<Order_detail> cart_list =order_detailService.findCart();
			mv.addObject("cart_list",cart_list);

			//跳转到goods-cart页面
			mv.setViewName("forward:/goods-cart");
			return mv;
		}
		//所有订单
		@RequestMapping(value="my_order")
		public ModelAndView my_order(ModelAndView mv){
			List<Order_detail> od_list =order_detailService.findOrderByOrder_sn();
			mv.addObject("od_list",od_list);
			List<Order> order_list=orderService.findAllOrder();
			mv.addObject("order_list",order_list);
			//跳转到goods-order页面
			mv.setViewName("forward:/goods-order");
			return mv;
		}
		@RequestMapping(value="od")
		public ModelAndView od(ModelAndView mv,@RequestParam("order_sn") String order_sn,HttpSession session){
			Order order=orderService.findOrderByOrder_sn(order_sn);
			Order_detail order_detail=order_detailService.findOrderByOs(order_sn);
			session.setAttribute("order", order);
			session.setAttribute("order_detail",order_detail);
			mv.setViewName("order-detail");
			return mv;
		}
}
