/**
 * 
 */
package me.second_life.ilost.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import me.second_life.ilost.dao.IUserDao;
import me.second_life.ilost.pojo.User;
import me.second_life.ilost.service.IUserService;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月29日 下午10:45:57
 * @mail
 * @version v1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

	private IUserDao userDao = null;

	@Override
	public boolean saveUser(User user) {
		return userDao.save(user);
	}

	@Override
	public void saveUserThrowException() throws Exception {

	}

	@Override
	public List<User> findUsers() {
		List<User> users = userDao.query("select * from user order by id",
				new Object[] { 17 });
		// for (User user : users) {
		// System.out.println(user.getUser_Name() + "    "
		// + user.getUser_Password());
		// }
		return users;
	}

	@Override
	public boolean findUser(String username, String password) {
		boolean found = false;
		List<User> users = userDao.query(
				"select * from user order by id where user_name = '" + username
						+ "' and password = '" + password + "'",
				new Object[] { 17 });
		if (users.size() > 0) {
			found = true;
		}
		return found;
	}

}
