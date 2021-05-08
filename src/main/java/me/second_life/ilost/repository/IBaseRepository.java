package me.second_life.ilost.repository;

/**
 * @Description 数据仓库操作通用接口
 * @author 可凡
 * @date 2014年01月03日 下午22:10:32
 * @mail
 * @version v1.0.0
 */
public interface IBaseRepository<T> {

	/*
	 * 增加
	 */
	boolean add(final T t);

	/*
	 * 更新
	 */
	boolean update(final T t);

	/*
	 * 删除
	 */
	boolean remove(final T t);

	/*
	 * 查询
	 */
	T get(final T t);

	/*
	 * 检查
	 */
	boolean exist(final T t);

}
