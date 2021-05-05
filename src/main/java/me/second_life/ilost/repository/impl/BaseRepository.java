/**
 * 
 */
package me.second_life.ilost.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description 基础仓库类，注入JdbcTemplate
 * @author 可凡
 * @date 2014年4月4日 下午4:59:27
 * @mail
 * @version v1.0.0
 */
@Repository
public class BaseRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate(){
		return this.jdbcTemplate;
	}

}
