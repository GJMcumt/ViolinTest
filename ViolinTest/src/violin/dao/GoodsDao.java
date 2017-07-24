package violin.dao;

import static violin.util.common.Constants.GOODSTABLE;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import violin.dynaSqlProvider.GoodsDynaSqlProvider;

import violin.domain.Goods;

public interface GoodsDao {
	//查询所有商品
	@Select("select * from "+GOODSTABLE+" ")
	List<Goods> selectAllGoods();
	//查询所有在销售中的商品
	@Select("select * from "+GOODSTABLE+" where goods_status=1")
	List<Goods> selectGoods();	
	//根据商品名称查询商品
		@Select ("select * from "+GOODSTABLE+" where goods_name=#{goods_name}")
		Goods selectByGoods_name(String goods_name);
	//根据goods_sn查询商品
		@Select ("select * from "+GOODSTABLE+" where goods_sn=#{goods_sn}")
		Goods selectByGoods_sn(String goods_sn);

		//根据Goods_sn删除商品
		@Delete ("delete from "+GOODSTABLE+" where goods_sn=#{goods_sn}")
		void deleteByGoods_sn(String goods_sn);
		//动态插入
		@SelectProvider(type=GoodsDynaSqlProvider.class,method="insertGoods")
		void save(Goods goods);
		
		//动态查询
			@SelectProvider(type=GoodsDynaSqlProvider.class,method="selectWithParam")
			List<Goods> selectByName(Map<String, Object>params);
		//动态更新
			@SelectProvider(type=GoodsDynaSqlProvider.class,method="updateGoods")
			void update(Goods goods);
//			@Update("update "+GOODSTABLE+" set goods_name=#{goods_name},type=#{type},price=#{price},describe=#{describe},image1=#{image1},image2=#{image2},image3=#{image3},image4=#{image4},goods_status=#{goods_status},inventory=#{inventory} where goods_sn=#{goods_sn}")
//			void update(Goods goods);
		//修改库存
			@Update("update "+GOODSTABLE+" set inventory=inventory-#{buy_count} where goods_sn=#{goods_sn}")
			void updateInventory(@Param("buy_count")Integer buy_count,@Param("goods_sn")String goods_sn);

	

}
