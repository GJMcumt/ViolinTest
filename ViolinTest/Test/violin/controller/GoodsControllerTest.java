package violin.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import violin.domain.Goods;
import violin.service.GoodsService;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/applicationContext.xml","classpath*:/springmvc-config.xml"})
public class GoodsControllerTest {
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGoods() {
		List<Goods> goods_list = goodsService.findGoods();
		for(Goods list : goods_list ){
			if(list!=null){	
				System.out.println(list);
		}else{
			System.out.println("没有找到商品");
		}
		
			
		}
	}

	@Test
	public void testGoods_detail() {
		fail("尚未实现");
	}

	@Test
	public void testSelect_goods() {
		fail("尚未实现");
	}

	@Test
	public void testAddGoods() {
		fail("尚未实现");
	}

	@Test
	public void testDelete_cart() {
		fail("尚未实现");
	}

	@Test
	public void testFind_goods() {
		fail("尚未实现");
	}

	@Test
	public void testUpdate_goods() {
		fail("尚未实现");
	}

}
