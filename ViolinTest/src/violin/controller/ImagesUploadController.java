package violin.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import violin.domain.Goods;
import violin.service.GoodsService;

@Controller
public class ImagesUploadController {
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	// 上传文件会自动绑定到MultipartFile中
	 @RequestMapping(value="/upload",method=RequestMethod.POST)
	 public String upload(@ModelAttribute Goods goods,HttpServletRequest request,
			@RequestParam(value="file",required=false) MultipartFile[] file) throws Exception{
		 int count=-1;
		 String fn[]=new String[4];
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
//				return "addGoods";
			}else{
				return "error";
			}
		 }
        goods.setImage1(fn[0]);
        goods.setImage2(fn[1]);
        goods.setImage3(fn[2]);
        goods.setImage4(fn[3]);
		goodsService.addGoods(goods);
		return "addGoods";
		}

}
