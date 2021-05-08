/**
 * 
 */
package me.second_life.ilost.repository.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import me.second_life.ilost.repository.IBaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 基础仓库类，注入JdbcTemplate
 * 
 * @author 可凡
 * @date 2014年4月4日 下午4:59:27
 * @version 1.0.0
 * @param <T>
 *            需要持久化的对象
 */
@Repository
public abstract class BaseRepository<T> extends JdbcDaoSupport implements
		IBaseRepository<T> {

	/**
	 * 注入配置文件中的dataSource Bean
	 */
	@Autowired
	private DataSource dataSource;

	/**
	 * 在有依赖关系的dataSource注入之后自动运行<b>
	 * 给JdbcDaoSupport类中注入dataSource和jdbcTeplate
	 */
	@PostConstruct
	void init() {
		setDataSource(dataSource);
	}

}
