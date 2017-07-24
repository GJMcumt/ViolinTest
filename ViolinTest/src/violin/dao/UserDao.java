package violin.dao;

import java.util.*;

import static violin.util.common.Constants.USERTABLE;

import org.apache.ibatis.annotations.*;
import violin.domain.User;
import violin.dynaSqlProvider.UserDynaSqlProvider;
public interface UserDao {
	//根据用户名和密码查询用户
	@Select("select * from "+USERTABLE+" where user_name=#{user_name} and password=#{password}")
	User selectByUsernameAndPassword(
			@Param("user_name") String user_name,
			@Param("password") String password);
	// 通过用户名和邮箱找出用户信息
	@Select("select * from "+USERTABLE+" where user_name=#{user_name} and email=#{email}")
	User selectByUsernameAndEmail(@Param("user_name")String user_name,@Param("email")String email);	
	//根据id查询用户
	@Select("select * from "+USERTABLE+" where id=#{id}")
	User selectById(Integer id);
	//根据id删除用户
	@Delete (" delete from "+USERTABLE+" where id=#{id}")
	void deleteById(Integer id);
	//插入用户
	//@Insert ("insert into user(user_name,password,email,phone,address) values(#{user_name},#{password},#{email},#{phone},#{address})")
	//void saveUser(User user);
	//动态插入用户
	@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
	void save(User user);
	//动态查询
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWithParam")
	List<User> selectByNameEmailOrPhone(Map<String, Object>params);
	//动态更新
	@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
	void update(User user);
	//根据user_name修改密码
	@Update("update "+USERTABLE+" set password=#{password} where user_name=#{user_name}")
	void updatePwd(User user);
	//根据用户名和邮箱找到密码
	@Select("select password from "+USERTABLE+" where user_name=#{user_name} and email=#{email}")
	User find(@Param("user_name")String user_name,@Param("email")String email);
}
