/**
 * 
 */
package me.second_life.ilost.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.repository.IBaseRepository;
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

	@Autowired
	private IBaseRepository<User> userRepository;

	@Override
	public User addUser(User user) {
		if (user != null && user instanceof User) {
			return userRepository.add(user);
		} else {
			return null;
		}
	}

	@Override
	public List<User> getUsers() {
		return null;
		// List<User> users = userRepository.query(
		// "select * from user order by id", new Object[] { 17 });
		// // for (User user : users) {
		// // System.out.println(user.getUser_Name() + "    "
		// // + user.getUser_Password());
		// // }
		// return users;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * me.second_life.ilost.service.IUserService#getUser(me.second_life.ilost
	 * .pojo.User)
	 */
	@Override
	public User getUser(User user) {

		if (user != null && user instanceof User) {
			return userRepository.get(user);
		} else {
			return null;
		}

	}

	@Override
	public boolean exsit(User user) {

		if (user != null && user instanceof User) {
			return userRepository.exist(user);
		} else {
			return false;
		}

	}

}
