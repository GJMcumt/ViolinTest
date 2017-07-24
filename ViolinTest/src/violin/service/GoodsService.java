package violin.service;

import java.util.List;

import violin.domain.Goods;

public interface GoodsService {
	//获得所有商品信息
	List<Goods> findAllGoods();
	//查询所有在销售的商品信息
	List<Goods> findGoods();
	//增加商品
	void addGoods(Goods goods);
	//删除商品
	void removeGoodsByGoods_sn(String goods_sn);
	//根据goods_sn选出商品
	Goods findGoodsByGoods_sn(String goods_sn);
	//根据商品名称查询
	Goods findGoodsByGoods_name(String goods_name);
	//根据商品id查询
	Goods fingGoodsByGoods_sn(String goods_sn);
	//更新商品信息
	void modifyGoods(Goods goods);
	//修改库存
	void modifyInventory(Integer buy_count,String goods_sn);
}
