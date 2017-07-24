package violin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import violin.domain.Collection_detail;
import violin.domain.Collections;
import violin.domain.Goods;
import violin.service.Col_detailService;
import violin.service.CollectionsService;
import violin.service.GoodsService;

@Controller
public class CollectionsController {
	//自动注入Service
	@Autowired
	@Qualifier("collectionsService")
	private CollectionsService collectionsService;
	@Autowired
	@Qualifier("col_detailService")
	private Col_detailService col_detailService;
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	
	@RequestMapping(value="/Col")
	public ModelAndView Col(@RequestParam("goods_name") String goods_name,@ModelAttribute Collections collections, Collection_detail collection_detail,ModelAndView mv){
		//根据商品名字判断收藏表里是否有改商品
		Collection_detail col_detail1=col_detailService.findCol_detailByGoods_name(goods_name);
		if(col_detail1 !=null){
			/** 查询商品信息     */
			List<Goods> goods_list = goodsService.findGoods();
			mv.addObject("goods_list",goods_list);
			mv.addObject("message", "已收藏过此商品啦");
			mv.setViewName("forward:/shopping");
		}else{
			
			collectionsService.addCollections(collections);
			col_detailService.addCol_detail(collection_detail,collections);
		}
		return mv;
	}
	
	
}
