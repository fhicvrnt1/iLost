/**
 * 
 */
package me.second_life.ilost.pojo;

/**
 * @Description 用户pojo
 * @author 可凡
 * @date 2013年12月20日 下午8:15:31
 * @mail liukefan@gmail.com
 * @version v1.0.0
 */
public class User extends Common {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2900686332819781030L;
	private int user_id;
	private String user_name;
	private String user_password;

	/**
	 * @return the id
	 */
	public int getUser_Id() {
		return user_id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setUser_Id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_Name() {
		return user_name;
	}

	/**
	 * @param user_name
	 *            the user_name to set
	 */
	public void setUser_Name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the user_password
	 */
	public String getUser_Password() {
		return user_password;
	}

	/**
	 * @param user_password
	 *            the user_password to set
	 */
	public void setUser_Password(String user_password) {
		this.user_password = user_password;
	}

}
