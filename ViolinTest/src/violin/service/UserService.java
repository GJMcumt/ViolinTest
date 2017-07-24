package violin.service;

import java.util.List;

import violin.domain.User;

public interface UserService {
	/*
	 * 用户登录
	 * @param user_name
	 * @param password
	 * @return User对象
	 */
	User login(String user_name,String password);
	// 通过用户名和邮箱找出用户信息
	User findByUsernameAndEmail(String user_name,String email);
	/*
	 * 根据id查询用户
	 * @param id
	 * @return 用户对象
	 */
	User findUserById(Integer id);
	
	/*
	 * 获得所有用户
	 * @return User对象的List集合
	 */
	List<User> findUser(User user); 
	/*
	 * 根据id删除用户
	 * @param id
	 */
	void removeUserById(Integer id);
	/*
	 * 修改用户
	 * @param User对象
	 */
	void modifyUser(Integer id);
	/*
	 * 添加用户
	 * @param User对象
	 */
	void addUser(User user);
	/*
	 * 	根据user_name修改密码
	 */
	void modifyPwd(User user);
	//找密码
	User find(String user_name,String email);
}
