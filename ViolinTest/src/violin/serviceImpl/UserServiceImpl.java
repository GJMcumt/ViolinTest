package violin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Transactional;

import violin.dao.UserDao;
import violin.domain.User;
import violin.service.UserService;

//@Transactional(isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
/*
 * 自动注入持久层Dao对象
 */
	@Autowired
	private UserDao userDao;
	@Override
	public User login(String user_name, String password) {
		// TODO 自动生成的方法存根
		return userDao.selectByUsernameAndPassword(user_name, password);
	}
//	@Transactional(readOnly=true)
	@Override
	public User findUserById(Integer id) {
		// TODO 自动生成的方法存根
		return userDao.selectById(id);
	}
//	@Transactional(readOnly=true)
	@Override
	public List<User> findUser(User user) {
		// TODO 自动生成的方法存根
		return null;
	}
//	@Transactional(readOnly=true)
	@Override
	public void removeUserById(Integer id) {
		userDao.deleteById(id);

	}
//	@Transactional(readOnly=true)
	@Override
	public void modifyUser(Integer id) {
		userDao.deleteById(id);

	}

	@Override
	public void addUser(User user) {
		userDao.save(user);

	}
	@Override
	public User findByUsernameAndEmail(String user_name, String email) {
		return userDao.selectByUsernameAndEmail(user_name, email);
	}
	@Override
	public void modifyPwd(User user) {
		userDao.updatePwd(user);
		
	}
	@Override
	public User find(String user_name, String email) {
		return userDao.find(user_name, email);
	}

}
