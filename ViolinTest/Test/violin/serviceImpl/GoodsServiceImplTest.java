package violin.serviceImpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import violin.dao.GoodsDao;
import violin.domain.Goods;

public class GoodsServiceImplTest {
@Autowired
private GoodsDao goodsDao;
	@Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void testFindAllGoods() {
//		fail("尚未实现");
//	}

	@Test
	public void testAddGoods() {
		Goods goods = new Goods();
		goods.setGoods_name("456");
		goods.setGoods_sn("456");
		goods.setGoods_status(1);
		goods.setInventory(456);
		goods.setPrice(456.0);
		goods.setType(5);		
		goodsDao.save(goods);
		
	}

//	@Test
//	public void testRemoveGoodsByGoods_sn() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testFindGoodsByGoods_name() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testFingGoodsByGoods_sn() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testFindGoods() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testFindGoodsByGoods_sn() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testModifyGoods() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testModifyInventory() {
//		fail("尚未实现");
//	}

}
