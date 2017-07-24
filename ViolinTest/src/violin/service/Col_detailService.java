package violin.service;

import java.util.List;

import violin.domain.Collection_detail;
import violin.domain.Collections;

public interface Col_detailService {
//找出收藏详情里所有信息
	List<Collection_detail> findAllCol_detail();
//添加信息到收藏详情里
	void addCol_detail(Collection_detail collection_details,Collections collections);
//根据上商品名称选出商品
	Collection_detail findCol_detailByGoods_name(String goods_name);
}
