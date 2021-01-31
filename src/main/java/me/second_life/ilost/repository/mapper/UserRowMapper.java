/**
 * 
 */
package me.second_life.ilost.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import me.second_life.ilost.pojo.User;

/**
 * @Description
 * @author 可凡
 * @date 2014年1月3日 下午10:30:13
 * @mail
 * @version v1.0.0
 */
public class UserRowMapper implements IPojoRowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUser_Id(rs.getString("user_id"));
		user.setUser_Name(rs.getString("user_name"));
		user.setUser_Password(rs.getString("user_password"));
		return user;
	}

}
