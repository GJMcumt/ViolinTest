package violin.dynaSqlProvider;

import static violin.util.common.Constants.ETABLE;

import org.apache.ibatis.jdbc.SQL;

import violin.domain.Evaluation;

public class EvaluationDynaSqlProvider {
	
	//动态插入
	public String insertEvaluation(Evaluation evaluation){
		return new SQL(){
			{
				INSERT_INTO(ETABLE);
				if(evaluation.getOrder_sn() !=null ){
					VALUES("order_sn","#{order_sn}");
				}
				if(evaluation.getEvaluation() !=null ){
					VALUES("evaluation","#{evaluation}");
				}

				if(evaluation.getImage1() !=null ){
					VALUES("image1","#{image1}");
				}
				if(evaluation.getImage2() !=null ){
					VALUES("image2","#{image2}");
				}
//				if(evaluation.getImage3() !=null ){
//					VALUES("image3","#{image3}");
//				}
//				if(evaluation.getImage4() !=null ){
//					VALUES("image4","#{image4}");
//				}
				if(evaluation.getLogistics() !=null ){
					VALUES("logistics","#{logistics}");
				}
				if(evaluation.getQuality() !=null ){
					VALUES("quality","#{quality}");
				}
				if(evaluation.getService() !=null ){
					VALUES("service","#{service}");
				}
			}
		}.toString();

	}
}
