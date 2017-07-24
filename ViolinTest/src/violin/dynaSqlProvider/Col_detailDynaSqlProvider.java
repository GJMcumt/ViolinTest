package violin.dynaSqlProvider;

import static violin.util.common.Constants.COLDTABLE;

import org.apache.ibatis.jdbc.SQL;

import violin.domain.Collection_detail;


public class Col_detailDynaSqlProvider {
	//动态插入
	public String insertCol_detail(Collection_detail collection_detail){
		return new SQL(){
			{
				INSERT_INTO(COLDTABLE);
				if(collection_detail.getGoods_name() !=null ){
					VALUES("goods_name","#{goods_name}");
				}
				if(collection_detail.getCollection_sn() !=null ){
					VALUES("collection_sn","#{collection_sn}");
				}
				if(collection_detail.getImage1() !=null ){
					VALUES("image1","#{image1}");
				}
			
			}
		}.toString();
	}
}
