/**
 * 
 */
package me.second_life.ilost.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import me.second_life.ilost.dao.IUserDao;
import me.second_life.ilost.pojo.User;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月27日 下午3:56:16
 * @mail
 * @version v1.0.0
 */
@Repository
public class UserDaoImpl extends JdbcDaoSupport implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	class UserRowMapper implements RowMapper<User> {
		// 实现 ResultSet 到 User 实体的转换
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUser_Id(rs.getString("user_id"));
			user.setUser_Name(rs.getString("user_name"));
			user.setUser_Password(rs.getString("user_password"));
			return user;
		}
	}

	@Override
	public boolean save(User user) {

		String sqlStr = "insert into user(user_name,user_password) values(?,?)";
		Object[] args = { user.getUser_Name(), user.getUser_Password() };
		return jdbcTemplate.update(sqlStr, args) > 0 ? true : false;

	}

	@Override
	public List<User> query(String sql, Object[] args) {
		return jdbcTemplate.query(sql, args, new UserRowMapper());
	}
}
