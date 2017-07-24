package violin.dao;

import org.apache.ibatis.annotations.SelectProvider;

import violin.domain.Evaluation;
import violin.dynaSqlProvider.EvaluationDynaSqlProvider;

public interface EvaluationDao {
//添加评价信息
	@SelectProvider(type=EvaluationDynaSqlProvider.class,method="insertEvaluation")
	void saveEvaluation(Evaluation evaluation);
}
