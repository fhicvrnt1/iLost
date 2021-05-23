/**
 * 
 */
package me.second_life.ilost.service;

import java.util.List;

import me.second_life.ilost.pojo.User;

/**
 * <p>
 * 用户业务接口
 * 
 * @author 可凡
 * @date 2013年12月29日 下午10:44:53
 * @version 1.0.0
 */
public interface IUserService extends IService<User> {

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return 执行结果
	 */
	User addUser(User user);

	/**
	 * 查询用户
	 * 
	 * @param user
	 * @return 用户对象
	 */
	User getUser(User user);

	/**
	 * 查询全部用户
	 * 
	 * @return 包含全部用户对象的List集合
	 */
	List<User> getUsers();

	/**
	 * 检查用户是否存在
	 * 
	 * @param user
	 * @return 是否存在
	 */
	boolean exsit(User user);
}
