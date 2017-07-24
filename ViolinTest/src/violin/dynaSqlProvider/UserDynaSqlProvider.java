package violin.dynaSqlProvider;

import org.apache.ibatis.jdbc.SQL;
import violin.domain.User;
import static violin.util.common.Constants.USERTABLE;

import java.util.Map;

public class UserDynaSqlProvider {
	//动态查询
	public String selectWithParam(Map<String, Object>params){
		String sql = new SQL(){
			{
				SELECT("*");
				FROM(USERTABLE);
				if(params.get("user") !=null){
					User user = (User)params.get("user");
					if(user.getUser_name() !=null && !user.getUser_name().equals("")){
						WHERE("user_name = #{user_name}");
					}
					if(user.getEmail() !=null && !user.getEmail().equals("")){
						WHERE("email = #{email}");
					}
					if(user.getPhone() !=null && !user.getPhone().equals("")){
						WHERE("phone = #{phone}");
					}
				}
			}
		}.toString();
		return sql;
	}
	//动态插入
	public String insertUser(User user){
		return new SQL(){
			{
				INSERT_INTO(USERTABLE);
				if(user.getUser_name() !=null && !user.getUser_name().equals("")){
					VALUES("user_name","#{user_name}");
				}
				if(user.getPassword() !=null && !user.getPassword().equals("")){
					VALUES("password","#{password}");
				}
				if(user.getPhone() !=null && !user.getPhone().equals("")){
					VALUES("phone","#{phone}");
				}
				if(user.getAddress() !=null && !user.getAddress().equals("")){
					VALUES("address","#{address}");
				}
				if(user.getEmail() !=null && !user.getEmail().equals("")){
					VALUES("email","#{email}");
				}
			}
		}.toString();
	}
	//动态更新
	public String updateUser(User user){
		return new SQL(){
			{
				UPDATE(USERTABLE);
				if(user.getUser_name() !=null){
					SET("user_name=#{user_name}");
				}
				if(user.getPassword() !=null){
					SET("password = #{password}");
				}
				if(user.getPhone() !=null){
					SET("phone=#{phone}");
				}
				if(user.getEmail() !=null){
					SET("email=#{email}");
				} 
				if(user.getAddress() !=null){
					SET("address=#{address}");
				}
			}
		}.toString();
	}
}
