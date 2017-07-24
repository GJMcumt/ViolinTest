package violin.dao;
import static violin.util.common.Constants.COLTABLE;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import violin.domain.Collections;
import violin.dynaSqlProvider.CollectionsDynaSqlProvider;

public interface CollectionsDao {
//选出收藏表里的所有信息
	@Select("select * from "+COLTABLE+" ")
	List<Collections> selectAllCollections();
//动态把商品收藏到表里
	@SelectProvider(type=CollectionsDynaSqlProvider.class,method="insertCollections")
	void save(Collections collections);
}
