package violin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import violin.dao.Col_detailDao;
import violin.domain.Collection_detail;
import violin.domain.Collections;
import violin.service.Col_detailService;
@Service("col_detailService")
public class Col_detailServiceImpl implements Col_detailService {
	@Autowired
	private Col_detailDao col_detailDao;
	@Override
	public List<Collection_detail> findAllCol_detail() {

		return col_detailDao.selectAllCol_detail();
	}

	@Override
	public void addCol_detail(Collection_detail collection_detail,Collections collections) {
		String sn=collections.getCollection_sn();
		collection_detail.setCollection_sn(sn);
		col_detailDao.save(collection_detail);

	}

	@Override
	public Collection_detail findCol_detailByGoods_name(String goods_name) {
		// TODO 自动生成的方法存根
		return col_detailDao.selectAllCol_detailByGoods_name(goods_name);
	}

	

}
