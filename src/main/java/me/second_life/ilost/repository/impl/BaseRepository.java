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
 * @Description 基础仓库类，注入JdbcTemplate
 * @author 可凡
 * @date 2014年4月4日 下午4:59:27
 * @mail
 * @version v1.0.0
 */
@Repository
public abstract class BaseRepository<T> extends JdbcDaoSupport implements
		IBaseRepository<T> {

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	void init() {
		setDataSource(dataSource);
	}

}
