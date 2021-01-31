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
 * @param <T>
 */
public interface IUserService extends IService<User> {

	boolean addUser(User user);

	boolean getUser(String username, String password);

	List<User> getUsers();
}