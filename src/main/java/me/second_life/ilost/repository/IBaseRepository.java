package me.second_life.ilost.repository;

/**
 * @Description 数据仓库操作通用接口
 * @author 可凡
 * @date 2014年01月03日 下午22:10:32
 * @mail
 * @version v1.0.0
 */
public interface IBaseRepository<T> {

	
	/**
	 * add method
	 * @param t the 
	 * @return
	 */
	boolean add(final T t);

	/**
	 * update method
	 * @param t
	 * @return
	 */
	boolean update(final T t);

	/**
	 * delete method
	 * @param t
	 * @return
	 */
	boolean remove(final T t);

	/**
	 * select method
	 * @param t
	 * @return
	 */
	T get(final T t);

	/**
	 * exist method
	 * @param t
	 * @return
	 */
	boolean exist(final T t);

}
