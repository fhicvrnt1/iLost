/**
 * 
 */
package me.second_life.ilost.repository.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.repository.IUserRepository;
import me.second_life.ilost.repository.mapper.UserRowMapper;

/**
 * @Description
 * @author 可凡
 * @date 2013年12月27日 下午3:56:16
 * @mail
 * @version v1.0.0
 */
@Repository
public class UserRepositoryImpl extends JdbcDaoSupport implements
		IUserRepository<User> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> query(String sql, Object[] args) {
		return jdbcTemplate.query(sql, args, new UserRowMapper());
	}

	@Override
	public boolean add(User t) {
		String sqlStr = "insert into user(user_name,user_password) values(?,?)";
		Object[] args = { t.getUser_Name(), t.getUser_Password() };
		return jdbcTemplate.update(sqlStr, args) > 0 ? true : false;
	}

	@Override
	public boolean update(String id, User t) {
		String sqlStr = "update user set user_name = ?,user_password = ? where user_id = ?";
		Object[] args = { t.getUser_Name(), t.getUser_Password(),
				t.getUser_Id() };
		return jdbcTemplate.update(sqlStr, args) > 0 ? true : false;

	}

	@Override
	public boolean remove(String id) {
		String sqlStr = "delete user where user_id = '" + id + "'";
		return jdbcTemplate.update(sqlStr) > 0 ? true : false;

	}

	@Override
	public User get(String id) {
		return null;

	}

	@Override
	public Map<String, User> get(Iterable<String> ids) {
		return null;
	}

	@Override
	public boolean exist(String id) {
		return false;
	}

	@Override
	public long count() {
		String sqlStr = "select count(*) from user";
		return jdbcTemplate.queryForLong(sqlStr);
	}

}
