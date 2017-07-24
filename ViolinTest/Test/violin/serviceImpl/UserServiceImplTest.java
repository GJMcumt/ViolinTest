package violin.serviceImpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import violin.dao.UserDao;
import violin.domain.User;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/applicationContext.xml","classpath*:/springmvc-config.xml"})
public class UserServiceImplTest {
	@Autowired
	private UserDao userDao;
	@Test
	public void testLogin() {
		fail("尚未实现");
	}

	@Test
	public void testFindUserById() {
		
		User user=userDao.selectById(1);
		if(user != null){
			System.out.println(user);
		}else{
			System.out.println("没有找到User");
		}
	}

	@Test
	public void testFindUser() {
		fail("尚未实现");
	}

	@Test
	public void testRemoveUserById() {
		userDao.deleteById(6);
		
	}

	@Test
	public void testModifyUser() {
		fail("尚未实现");
	}

	@Test
	public void testAddUser() {
		fail("尚未实现");
	}

	@Test
	public void testFindByUsernameAndEmail() {
		fail("尚未实现");
	}

	@Test
	public void testModifyPwd() {
		fail("尚未实现");
	}

	@Test
	public void testFind() {
		fail("尚未实现");
	}

}
