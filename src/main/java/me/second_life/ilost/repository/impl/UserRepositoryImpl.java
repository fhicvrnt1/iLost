/**
 * 
 */
package me.second_life.ilost.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.repository.mapper.UserRowMapper;

/**
 * <p>用户数据仓库实现类
 * 
 * @author 可凡
 * @date 2013年12月27日 下午3:56:16
 * @version 1.0.0
 */
@Repository
public class UserRepositoryImpl extends BaseRepository<User> {

	/**
	 * 条件查询
	 * @param sql 查询sql，可以包含条件查询占位符
	 * @param args 占位符代表的条件值
	 * @return 包含全部用户对象的List集合
	 */
	public List<User> query(String sql, Object[] args) {
		return null;
		// return jdbcTemplate.query(sql, args, new UserRowMapper());
	}

	/* (non-Javadoc)
	 * @see me.second_life.ilost.repository.IBaseRepository#add(java.lang.Object)
	 */
	@Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see me.second_life.ilost.repository.IBaseRepository#update(java.lang.Object)
	 */
	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see me.second_life.ilost.repository.IBaseRepository#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	 * 查询单个用户
	 * @see me.second_life.ilost.repository.IBaseRepository#get(java.lang.Object)
	 */
	@Override
	public User get(User t) {
		String username = t.getUserName() != null ? t.getUserName() : "";
		String password = t.getUserPassword() != null ? t.getUserPassword()
				: "";
		String sql = "select * from user where user_name = ? and user_password= ? order by user_id";
		// query() 方法中，第一个参数为预编译sql，第二个参数为占位符，第三个参数为抽取对象，使用List接收
		List<User> users = getJdbcTemplate().query(sql,
				new Object[] { username, password }, new UserRowMapper());
		if (users != null && users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}
	
	/* 
	 * 验证用户是否存在
	 * @see me.second_life.ilost.repository.IBaseRepository#exist(java.lang.Object)
	 */
	@Override
	public boolean exist(User t) {
		String username = t.getUserName() != null ? t.getUserName() : "";
		String sql = "select * from user where user_name = ? order by user_id";
		// query() 方法中，第一个参数为预编译sql，第二个参数为占位符，第三个参数为抽取对象，使用List接收
		List<User> users = getJdbcTemplate().query(sql,
				new Object[] { username }, new UserRowMapper());
		if (users != null && users.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
