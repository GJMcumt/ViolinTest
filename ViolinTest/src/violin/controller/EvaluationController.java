package violin.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import violin.domain.Evaluation;
import violin.domain.Goods;
import violin.service.EvaluationService;
import violin.service.OrderService;

@Controller
public class EvaluationController {
@Autowired 
@Qualifier("evaluationService")
private EvaluationService evaluationService;
@Autowired 
@Qualifier("orderService")
private OrderService orderService;

@RequestMapping(value="/addEvaluation",method=RequestMethod.POST)
public String addEvaluation(@ModelAttribute Evaluation evaluation,HttpServletRequest request,
		@RequestParam(value="file",required=false) MultipartFile[] file,HttpSession session) throws Exception{
	 int count=-1;
	 String fn[]=new String[2];
	for(MultipartFile mf : file){
		count=count+1;
	    // 如果文件不为空，写入上传路径
		if(!mf.isEmpty()){
			// 上传文件路径
			String path = request.getServletContext().getRealPath(
	                "/images/");
			// 上传文件名
			String filename = mf.getOriginalFilename();
			fn[count]=filename;
		    File filepath = new File(path,filename);
			// 判断路径是否存在，如果不存在就创建一个
	        if (!filepath.getParentFile().exists()) { 
	        	filepath.getParentFile().mkdirs();
	        }
	        // 将上传文件保存到一个目标文件当中
	        mf.transferTo(new File("D:\\大二下课程\\大作业\\Examples\\ViolinTest\\WebContent\\images\\"+ filename));
//			return "addGoods";
		}else{
			evaluationService.addEvaluation(evaluation);
			orderService.modifyOrder_status3();
			return "Thanks";
		}
	 }
	evaluation.setImage1(fn[0]);
	evaluation.setImage2(fn[1]);
	evaluationService.addEvaluation(evaluation);
	orderService.modifyOrder_status3();
	//跳转到Thanks页面
	return "Thanks";
	}

}
