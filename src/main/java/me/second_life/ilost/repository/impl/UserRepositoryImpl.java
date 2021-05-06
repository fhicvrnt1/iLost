/**
 * 
 */
package me.second_life.ilost.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.second_life.ilost.pojo.User;
import me.second_life.ilost.repository.IUserRepository;
import me.second_life.ilost.repository.mapper.UserRowMapper;

/**
 * @Description 用户数据仓库实现类
 * @author 可凡
 * @date 2013年12月27日 下午3:56:16
 * @mail
 * @version v1.0.0
 */
@Repository
public class UserRepositoryImpl extends BaseRepository implements
		IUserRepository<User> {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public List<User> query(String sql, Object[] args) {
		return null;
		// return jdbcTemplate.query(sql, args, new UserRowMapper());
	}

	@Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User get(User t) {
		// TODO 查询单个用户
		String username = t.getUserName() != null ? t.getUserName() : "";
		String sql = "select * from user where user_name = ? order by user_id";
		// query() 方法中，第一个参数为预编译sql，第二个参数为占位符，第三个参数为抽取对象，使用List接收
		List<User> users = getJdbcTemplate().query(sql, new Object[] { username },
				new UserRowMapper());
		if (users != null && users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public boolean exist(User t) {
		// TODO Auto-generated method stub
		return false;
	}

}
