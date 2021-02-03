package me.second_life.ilost.repository;

import java.util.Map;

/**
 * @Description
 * @author 可凡
 * @date 2014年01月03日 下午22:10:32
 * @mail
 * @version v1.0.0
 */
public interface Repository<T> {

	boolean add(final T t);

	boolean update(final String id, final T t);

	boolean remove(final String id);

	T get(final String id);

	Map<String, T> get(final Iterable<String> ids);

	boolean exist(final String id);

	long count();

}
