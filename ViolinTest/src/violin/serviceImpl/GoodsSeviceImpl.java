package violin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Transactional;

import violin.dao.GoodsDao;
import violin.domain.Goods;
import violin.service.GoodsService;


@Service("goodsService")
public class GoodsSeviceImpl implements GoodsService {
	/*
	 * 自动注入持久层Dao对象
	 */
		@Autowired
		private GoodsDao goodsDao;

	@Override
	public List<Goods> findAllGoods() {
		
		return goodsDao.selectAllGoods();
	}

	@Override
	public void addGoods(Goods goods) {
		goodsDao.save(goods);

	}

	@Override
	public void removeGoodsByGoods_sn(String goods_sn) {
		goodsDao.deleteByGoods_sn(goods_sn);

	}

	@Override
	public Goods findGoodsByGoods_name(String goods_name) {
		return goodsDao.selectByGoods_name(goods_name);
	}

	@Override
	public Goods fingGoodsByGoods_sn(String goods_sn) {
		// TODO 自动生成的方法存根
		return goodsDao.selectByGoods_sn(goods_sn);
	}

	@Override
	public List<Goods> findGoods() {
		return goodsDao.selectGoods();
	}

	@Override
	public Goods findGoodsByGoods_sn(String goods_sn) {
		return goodsDao.selectByGoods_sn(goods_sn);
	}

	@Override
	public void modifyGoods(Goods goods) {
		 goodsDao.update(goods);
	}

	@Override
	public void modifyInventory(Integer buy_count,String goods_sn) {
		goodsDao.updateInventory(buy_count,goods_sn);
		
	}
	

	

}
