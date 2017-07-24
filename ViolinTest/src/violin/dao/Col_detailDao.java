package violin.dao;
import static violin.util.common.Constants.COLDTABLE;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import violin.domain.Collection_detail;
import violin.domain.Collections;
import violin.dynaSqlProvider.Col_detailDynaSqlProvider;
public interface Col_detailDao {
//查找出收藏详情里所有信息
	@Select("select * from "+COLDTABLE+"")
	List<Collection_detail> selectAllCol_detail();
//动态插入信息
	@SelectProvider(type=Col_detailDynaSqlProvider.class,method="insertCol_detail")
	void save(Collection_detail collection_detail);
//根据商品名字选出商品
	@Select("select * from "+COLDTABLE+" where goods_name=#{goods_name} ")
	Collection_detail selectAllCol_detailByGoods_name(String goods_name);
	
}
