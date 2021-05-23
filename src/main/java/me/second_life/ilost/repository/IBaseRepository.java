package me.second_life.ilost.repository;

/**
 * <p>数据仓库操作通用接口
 * 
 * @author 可凡
 * @date 2014年01月03日 下午22:10:32
 * @version 1.0.0
 * @param <T>
 */
public interface IBaseRepository<T> {

	/**
	 * 添加方法
	 * @param t 要添加的对象
	 * @return 执行结果
	 */
	T add(final T t);

	/**
	 * 更新方法
	 * @param t 要更新的对象
	 * @return 执行结果
	 */
	T update(final T t);

	/**
	 * 删除方法
	 * @param t 要删除的对象
	 * @return 执行结果
	 */
	T remove(final T t);

	/**
	 * 查询方法
	 * @param t 要查询的对象
	 * @return 查询对象
	 */
	T get(final T t);

	/**
	 * 检查是否存在方法
	 * @param t 要检查的对象
	 * @return 是否存在
	 */
	boolean exist(final T t);

}
