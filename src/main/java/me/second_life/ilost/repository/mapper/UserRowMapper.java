/**
 * 
 */
package me.second_life.ilost.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.joda.time.DateTime;

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
		int user_id = rs.getInt("user_id");
		user.setUserId(user_id > 0 ? user_id : 0);
		String user_name = rs.getString("user_name");
		user.setUserName(user_name != null ? user_name : "");
		String user_password = rs.getString("user_password");
		user.setUserPassword(user_password != null ? user_password : "");
		String adduser = rs.getString("adduser");
		user.setAddUser(adduser != null ? adduser : "");
		Date adddtime = rs.getDate("addtime");
		user.setAddTime(adddtime != null ? new DateTime(adddtime) : null);
		String updateuser = rs.getString("updateuser");
		user.setAddUser(updateuser != null ? updateuser : "");
		Date updatetime = rs.getDate("updatetime");
		user.setUpdateTime(updatetime != null ? new DateTime(updatetime) : null);
		return user;
	}

}
