package violin.dynaSqlProvider;

import static violin.util.common.Constants.COLTABLE;

import org.apache.ibatis.jdbc.SQL;

import violin.domain.Collections;


public class CollectionsDynaSqlProvider {
	
	//动态插入
	public String insertCollections(Collections collections){
		return new SQL(){
			{
				INSERT_INTO(COLTABLE);
				if(collections.getUser_id() !=null ){
					VALUES("user_id","#{user_id}");
				}
				if(collections.getCollection_sn() !=null ){
					VALUES("collection_sn","#{collection_sn}");
				}
			
			}
		}.toString();
	}
}
