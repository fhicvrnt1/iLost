/**
 * 
 */
package me.second_life.ilost.dao;

import java.util.List;

import me.second_life.ilost.pojo.User;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月27日 下午3:49:32
 * @mail
 * @version v1.0.0
 */
public interface IUserDao {
	
	public boolean save(User user);

	public List<User> query(String sql, Object[] args);
}
