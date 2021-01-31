/**
 * 
 */
package me.second_life.ilost.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @Description
 * @author 可凡
 * @date 2014年1月3日 下午10:31:13
 * @mail
 * @version v1.0.0
 * @param <T>
 */
public interface IPojoRowMapper<T> extends RowMapper<T> {

	@Override
	public T mapRow(ResultSet rs, int rowNum) throws SQLException;
}
