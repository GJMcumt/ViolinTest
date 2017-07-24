package violin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import violin.domain.User;
import violin.service.UserService;
import violin.util.common.Constants;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
		
	/**
	 * 处理登录请求
	 * @param String loginname  登录名
	 * @param String password 密码
	 * @return 跳转的视图
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(@RequestParam("user_name") String user_name,
			 @RequestParam("password") String password,
			 HttpSession session,
			 ModelAndView mv){
		// 调用业务逻辑组件判断用户是否可以登录
		User user = userService.login(user_name, password);
		if(user != null){
			// 将用户保存到HttpSession当中
			session.setAttribute(Constants.USER_SESSION, user);
			if(user_name.equals("admin")){
				//如果是管理员，跳转到修改商品的页面
				mv.setViewName("forward:/alter-goods");
			}else{
				// 客户端跳转到goods请求
				mv.setViewName("redirect:/goods");	
			}

		}else{
			// 设置登录失败提示信息
			mv.addObject("message", "登录名或密码错误!请重新输入");
			// 服务器内部跳转到登录页面
			mv.setViewName("forward:/loginForm");
		}
		return mv;
		
	}
	
	/**
	 * 处理添加请求
	 * @param String flag 标记， 1表示跳转到添加页面，2表示执行添加操作
	 * @param User user  要添加用户的对象
	 * @param ModelAndView mv
	 * */
	@RequestMapping(value="/addUser")
	 public ModelAndView addUser(
//			 String flag,
			 @ModelAttribute User user,
			 ModelAndView mv){
//		if(flag.equals("1")){
//			// 设置跳转到添加页面
//			mv.setViewName("signUp");
//		}else{
			// 执行添加操作
			userService.addUser(user);
			// 设置客户端跳转到首页
			mv.setViewName("index");
//		}
		// 返回
		return mv;
	}
	
	/**
	 * 处理查询请求
	 * @param pageIndex 请求的是第几页
	 * @param employee 模糊查询参数
	 * @param Model model
	 * */
	@RequestMapping(value="/user/selectUser")
	 public String selectUser(
			 @ModelAttribute User user,
			 Model model){
		System.out.println("user = " + user);
		/** 查询用户信息     */
		List<User> users = userService.findUser(user);
		model.addAttribute("users", users);
		return "user/user";
		
	}
//	
//	/**
//	 * 处理删除用户请求
//	 * @param String ids 需要删除的id字符串
//	 * @param ModelAndView mv
//	 * */
//	@RequestMapping(value="/user/removeUser")
//	 public ModelAndView removeUser(String ids,ModelAndView mv){
//		// 分解id字符串
//		String[] idArray = ids.split(",");
//		for(String id : idArray){
//			// 根据id删除员工
//			hrmService.removeUserById(Integer.parseInt(id));
//		}
//		// 设置客户端跳转到查询请求
//		mv.setViewName("redirect:/user/selectUser");
//		// 返回ModelAndView
//		return mv;
//	}
//	
//	
//	/**
//	 * 处理修改用户请求
//	 * @param String flag 标记， 1表示跳转到修改页面，2表示执行修改操作
//	 * @param User user  要修改用户的对象
//	 * @param ModelAndView mv
//	 * */
//	@RequestMapping(value="/user/updateUser")
//	 public ModelAndView updateUser(
//			 String flag,
//			 @ModelAttribute User user,
//			 ModelAndView mv){
//		if(flag.equals("1")){
//			// 根据id查询用户
//			User target = hrmService.findUserById(user.getId());
//			// 设置Model数据
//			mv.addObject("user", target);
//			// 返回修改员工页面
//			mv.setViewName("user/showUpdateUser");
//		}else{
//			// 执行修改操作
//			hrmService.modifyUser(user);
//			// 设置客户端跳转到查询请求
//			mv.setViewName("redirect:/user/selectUser");
//		}
//		// 返回
//		return mv;
//	}
//	
//	修改密码
	@RequestMapping(value="/setPwd")
	 public ModelAndView setPwd(@RequestParam("user_name") String user_name,
			 @RequestParam("password") String password, @RequestParam("email") String email,
			 HttpSession session, ModelAndView mv,@ModelAttribute User user){
		// 通过用户名和邮箱找出用户信息
		User user1 = userService.findByUsernameAndEmail(user_name, email);
		if(user1 != null){
			//如果找到了user,则修改密码
			userService.modifyPwd(user);
			mv.addObject("message", "密码修改成功，请重新登录");
			mv.setViewName("forward:/loginForm");

		}else{
			// 设置登录失败提示信息
			mv.addObject("message", "登录名或邮箱错误!请重新输入");
			// 服务器内部跳转到登录页面
			mv.setViewName("forward:/modifyPassword");
		}
		return mv;
		
	}
	//找回密码
	@RequestMapping(value="/find",method = RequestMethod.POST)
	public ModelAndView find(
			@RequestParam("user_name") String user_name,@RequestParam("email") String email,
		ModelAndView mv,HttpSession session,HttpServletRequest request,HttpServletResponse response)throws Exception{	
			
	    User user=userService.find(user_name,email);

		if(user!=null){
			
			StringBuffer url = new StringBuffer();
			StringBuilder builder = new StringBuilder();
			// 正文
			builder.append("");
			url.append(user.getPassword() );
			builder.append("");
			builder.append("" + url + "");
			builder.append("");
			SimpleEmail sendemail = new SimpleEmail();
			sendemail.setHostName("smtp.163.com");// 指定要使用的邮件服务器
			sendemail.setAuthentication("15162176067@163.com", "asd123");// 使用163的邮件服务器需提供在163已注册的用户名、密码
			sendemail.setCharset("UTF-8");
			try {
				sendemail.setCharset("UTF-8");
				sendemail.addTo(email);
				sendemail.setFrom("15162176067@163.com");
				sendemail.setSubject("找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			} catch (EmailException e) {
				e.printStackTrace();
			}
			mv.addObject("message", "你的密码为已成功发送到邮箱");
			mv.setViewName("loginForm");
		}else{
			response.getWriter().println("获取密码失败");
		}
	    return mv;
	}

	
}
