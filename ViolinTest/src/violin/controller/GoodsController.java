package violin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import violin.domain.Goods;
import violin.service.GoodsService;
import violin.util.common.Constants;

/** 
 * 处理用户请求控制器
 * */
@Controller
public class GoodsController {
	/**
	 * 自动注入GoodsService
	 * */
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	/**
	 * 处理goods请求
	 */
	@RequestMapping(value="/goods")
	public ModelAndView goods(ModelAndView mv,HttpSession session){
		
	/** 查询商品信息     */
		List<Goods> goods_list = goodsService.findGoods();
		mv.addObject("goods_list",goods_list);
		//跳转到shopping页面
		mv.setViewName("forward:/shopping");
		return mv;
		
	}
	@RequestMapping(value="/goods1")
	public String goods_detail(@RequestParam("goods_name") String goods_name,ModelAndView mv,HttpSession session){
		//根据goods_name找出goods的所有信息
		Goods goods = goodsService.findGoodsByGoods_name(goods_name);
		//把goods的信息保存到session中
			session.setAttribute("goods",goods);
	
		return "goods-detail";		
	}
	
	@RequestMapping(value="/select_goods")
	public ModelAndView select_goods(ModelAndView mv,HttpSession session){
		
	/** 管理员查询商品信息     */
		List<Goods> goods1_list = goodsService.findAllGoods();
		mv.addObject("goods1_list",goods1_list);
		//跳转到selectGoods页面
		mv.setViewName("forward:/selectGoods");
		return mv;
	}
	/** 管理员添加商品信息     */	
	@RequestMapping(value="/add_Goods")
	public ModelAndView addGoods(@ModelAttribute Goods goods,ModelAndView mv){
		goodsService.addGoods(goods);
		mv.setViewName("forward:/addGoods");
		return mv;		
	}
	/** 管理员删除商品信息     */		
	@RequestMapping(value="/delete_goods")
	public ModelAndView delete_cart(@RequestParam("goods_sn") String goods_sn,ModelAndView mv){

			//根据id删除商品
			goodsService.removeGoodsByGoods_sn(goods_sn);
//			List<Goods> goods1_list =goodsService.findAllGoods();
//			mv.addObject("goods1_list",goods1_list);
			mv.setViewName("redirect:/select_goods");
		return mv;
		
	}
	/** 管理员修改商品信息     */	
	//先根据goods_sn找出商品
	@RequestMapping(value="/find_goods")
	public ModelAndView find_goods(@RequestParam("goods_sn") String goods_sn,ModelAndView mv,HttpSession session){

			//根据goods_sn选出商品
			Goods goods=goodsService.fingGoodsByGoods_sn(goods_sn);
			session.setAttribute(Constants.GOODS_SESSION, goods);
			mv.setViewName("redirect:/updateGoods");
		return mv;
		
	}
	//修改
	@RequestMapping(value="/update_goods")
	public ModelAndView update_goods(@RequestParam("goods_sn") String goods_sn,@ModelAttribute Goods goods,ModelAndView mv){
			goodsService.modifyGoods(goods);
			mv.addObject("message", "修改成功！");
			mv.setViewName("forward:/alter-goods");
		return mv;
		
	}
}
