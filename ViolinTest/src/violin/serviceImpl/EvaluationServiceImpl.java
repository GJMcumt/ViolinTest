package violin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import violin.dao.EvaluationDao;
import violin.domain.Evaluation;
import violin.service.EvaluationService;
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {
@Autowired
private EvaluationDao evaluationDao;
	@Override
	public void addEvaluation(Evaluation evaluation) {
		evaluationDao.saveEvaluation(evaluation);

	}

}
