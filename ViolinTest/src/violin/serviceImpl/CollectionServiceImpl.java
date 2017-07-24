package violin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import violin.dao.CollectionsDao;
import violin.domain.Collections;
import violin.service.CollectionsService;
@Service("collectionsService")
public class CollectionServiceImpl implements CollectionsService {
//自动注入Dao
	@Autowired
	private CollectionsDao collectionsDao;
	@Override
	public void addCollections(Collections collections) {
		String sn="00"+collections.getUser_id();
		collections.setCollection_sn(sn);
		collectionsDao.save(collections);
	}

}
