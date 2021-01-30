/**
 * 
 */
package me.second_life.ilost.service;

import java.util.List;

import me.second_life.ilost.pojo.User;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月29日 下午10:44:53
 * @mail
 * @version v1.0.0
 */
public interface IUserService {

	boolean saveUser(User user);

	void saveUserThrowException() throws Exception;

	boolean findUser(String username, String password);

	List<User> findUsers();
}
